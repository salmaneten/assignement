<<<<<<< HEAD
package ma.octo.assignement.service;

import ma.octo.assignement.domain.Compte;
import ma.octo.assignement.domain.Versement;
import ma.octo.assignement.dto.VersementDto;
import ma.octo.assignement.repository.CompteRepository;
import ma.octo.assignement.repository.VersementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class VersementService {
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private VersementRepository versementRepository;
    public Compte debiterCompteBeneficiaire(Compte compte, VersementDto versement){
        compte.setSolde(new BigDecimal(compte.getSolde().intValue()
                        + versement.getMontantVersement().intValue()));
        return compteRepository.save(compte);
    }

    public Versement creerVersement(Compte compte, VersementDto versementDto){
        Versement versement = new Versement();
        versement.setCompteBeneficiaire(compte);
        versement.setDateExecution(versementDto.getDateExecution());
        versement.setMontantVersement(versementDto.getMontantVersement());
        versement.setMotifVersement(versementDto.getMotifVersement());
        versement.setNom_prenom_emetteur(versementDto.getNom_prenom_emetteur());
        return versementRepository.save(versement);
    }
}
=======
package ma.octo.assignement.service;

import ma.octo.assignement.domain.Compte;
import ma.octo.assignement.domain.Versement;
import ma.octo.assignement.dto.VersementDto;
import ma.octo.assignement.repository.CompteRepository;
import ma.octo.assignement.repository.VersementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class VersementService {
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private VersementRepository versementRepository;
    public Compte debiterCompteBeneficiaire(Compte compte, VersementDto versement){
        compte.setSolde(new BigDecimal(compte.getSolde().intValue()
                        + versement.getMontantVersement().intValue()));
        return compteRepository.save(compte);
    }

    public Versement creerVersement(Compte compte, VersementDto versementDto){
        Versement versement = new Versement();
        versement.setCompteBeneficiaire(compte);
        versement.setDateExecution(versementDto.getDateExecution());
        versement.setMontantVersement(versementDto.getMontantVersement());
        versement.setMotifVersement(versementDto.getMotifVersement());
        versement.setNom_prenom_emetteur(versementDto.getNom_prenom_emetteur());
        return versementRepository.save(versement);
    }
}
>>>>>>> b99430640569ed20c2c038a834893ce93b33adbc
