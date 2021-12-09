<<<<<<< HEAD
package ma.octo.assignement.dto;

import lombok.Data;
import ma.octo.assignement.domain.Compte;


import java.math.BigDecimal;
import java.util.Date;

@Data
public class VersementDto {

    private BigDecimal montantVersement;
    private Date dateExecution;
    private String nom_prenom_emetteur;
    private String ribCompteBeneficiaire;
    private String motifVersement;
}


=======
package ma.octo.assignement.dto;

import lombok.Data;
import ma.octo.assignement.domain.Compte;


import java.math.BigDecimal;
import java.util.Date;

@Data
public class VersementDto {

    private BigDecimal montantVersement;
    private Date dateExecution;
    private String nom_prenom_emetteur;
    private String ribCompteBeneficiaire;
    private String motifVersement;
}


>>>>>>> b99430640569ed20c2c038a834893ce93b33adbc
