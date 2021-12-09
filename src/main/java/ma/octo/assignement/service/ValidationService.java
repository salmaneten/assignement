<<<<<<< HEAD
package ma.octo.assignement.service;

import ma.octo.assignement.domain.Compte;
import ma.octo.assignement.dto.VersementDto;
import ma.octo.assignement.exceptions.CompteNonExistantException;
import ma.octo.assignement.exceptions.TransactionException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import static ma.octo.assignement.web.VersementController.MONTANT_MAXIMAL;

@Service
public class ValidationService {
    private void validerCompteBeneficiaire(Compte compte) {
        if (compte == null) {
            System.out.println("Compte Non existant");
            throw new CompteNonExistantException("Compte Non existant");
        }
    }

    private void validerMontant(BigDecimal montant){
        if (montant.intValue() == 0) {
            System.out.println("Montant vide");
            throw new TransactionException("Montant vide");
        } else if (montant.intValue() < 10) {
            System.out.println("Montant minimal de versement non atteint");
            throw new TransactionException("Montant minimal de versement non atteint");
        } else if (montant.intValue() > MONTANT_MAXIMAL) {
            System.out.println("Montant maximal de versement dépassé");
            throw new TransactionException("Montant maximal de versement dépassé");
        }
    }

    private void validerVersementMotif(String motif) {
        if (motif == null || motif.isEmpty() ) {
            System.out.println("Motif vide");
            throw new TransactionException("Motif vide");
        }
    }

    public void validerVersement(Compte compte, VersementDto versement) {
        validerCompteBeneficiaire(compte);
        validerMontant(versement.getMontantVersement());
        validerVersementMotif(versement.getMotifVersement());
    }
}
=======
package ma.octo.assignement.service;

import ma.octo.assignement.domain.Compte;
import ma.octo.assignement.dto.VersementDto;
import ma.octo.assignement.exceptions.CompteNonExistantException;
import ma.octo.assignement.exceptions.TransactionException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import static ma.octo.assignement.web.VersementController.MONTANT_MAXIMAL;

@Service
public class ValidationService {
    private void validerCompteBeneficiaire(Compte compte) {
        if (compte == null) {
            System.out.println("Compte Non existant");
            throw new CompteNonExistantException("Compte Non existant");
        }
    }

    private void validerMontant(BigDecimal montant){
        if (montant.intValue() == 0) {
            System.out.println("Montant vide");
            throw new TransactionException("Montant vide");
        } else if (montant.intValue() < 10) {
            System.out.println("Montant minimal de versement non atteint");
            throw new TransactionException("Montant minimal de versement non atteint");
        } else if (montant.intValue() > MONTANT_MAXIMAL) {
            System.out.println("Montant maximal de versement dépassé");
            throw new TransactionException("Montant maximal de versement dépassé");
        }
    }

    private void validerVersementMotif(String motif) {
        if (motif == null || motif.isEmpty() ) {
            System.out.println("Motif vide");
            throw new TransactionException("Motif vide");
        }
    }

    public void validerVersement(Compte compte, VersementDto versement) {
        validerCompteBeneficiaire(compte);
        validerMontant(versement.getMontantVersement());
        validerVersementMotif(versement.getMotifVersement());
    }
}
>>>>>>> b99430640569ed20c2c038a834893ce93b33adbc
