
package ma.octo.assignement.dto;

import lombok.Data;
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


