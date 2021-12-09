<<<<<<< HEAD
package ma.octo.assignement.web;

import ma.octo.assignement.domain.Compte;
import ma.octo.assignement.domain.Versement;
import ma.octo.assignement.dto.VersementDto;
import ma.octo.assignement.repository.CompteRepository;
import ma.octo.assignement.repository.VersementRepository;
import ma.octo.assignement.service.AutiService;
import ma.octo.assignement.service.ValidationService;
import ma.octo.assignement.service.VersementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("versements")
public class VersementController {
    public static final int MONTANT_MAXIMAL = 10000;

    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private VersementRepository versementRepository;
    @Autowired
    private AutiService autiService;
    @Autowired
    private ValidationService validationService;
    @Autowired
    private VersementService versementService;

    @GetMapping
    List<Versement> loadAll() {
        List<Versement> allVersements = versementRepository.findAll();

        if (CollectionUtils.isEmpty(allVersements)) {
            return null;
        } else {
            return allVersements;
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTransaction(@RequestBody VersementDto versementDto) {
        Compte compteBeneficiaire = compteRepository.findByrib(versementDto.getRibCompteBeneficiaire());

        validationService.validerVersement(compteBeneficiaire, versementDto);
        versementService.debiterCompteBeneficiaire(compteBeneficiaire, versementDto);
        versementService.creerVersement(compteBeneficiaire, versementDto);
        String auditMessage = "Versement par" +
                versementDto.getNom_prenom_emetteur() +
                " vers " +
                versementDto.getRibCompteBeneficiaire() +
                " d'un montant de " +
                versementDto.getMontantVersement();
        autiService.auditVersement(auditMessage);
    }


}
=======
package ma.octo.assignement.web;

import ma.octo.assignement.domain.Compte;
import ma.octo.assignement.domain.Versement;
import ma.octo.assignement.dto.VersementDto;
import ma.octo.assignement.repository.CompteRepository;
import ma.octo.assignement.repository.VersementRepository;
import ma.octo.assignement.service.AutiService;
import ma.octo.assignement.service.ValidationService;
import ma.octo.assignement.service.VersementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("versements")
public class VersementController {
    public static final int MONTANT_MAXIMAL = 10000;

    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private VersementRepository versementRepository;
    @Autowired
    private AutiService autiService;
    @Autowired
    private ValidationService validationService;
    @Autowired
    private VersementService versementService;

    @GetMapping
    List<Versement> loadAll() {
        List<Versement> allVersements = versementRepository.findAll();

        if (CollectionUtils.isEmpty(allVersements)) {
            return null;
        } else {
            return allVersements;
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTransaction(@RequestBody VersementDto versementDto) {
        Compte compteBeneficiaire = compteRepository.findByrib(versementDto.getRibCompteBeneficiaire());

        validationService.validerVersement(compteBeneficiaire, versementDto);
        versementService.debiterCompteBeneficiaire(compteBeneficiaire, versementDto);
        versementService.creerVersement(compteBeneficiaire, versementDto);
        String auditMessage = "Versement par" +
                versementDto.getNom_prenom_emetteur() +
                " vers " +
                versementDto.getRibCompteBeneficiaire() +
                " d'un montant de " +
                versementDto.getMontantVersement();
        autiService.auditVersement(auditMessage);
    }


}
>>>>>>> b99430640569ed20c2c038a834893ce93b33adbc
