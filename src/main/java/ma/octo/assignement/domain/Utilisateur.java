package ma.octo.assignement.domain;

import lombok.Data;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 10, nullable = false, unique = true)
  private String username;

  @Column(length = 10, nullable = false)
  private String gender;

  @Column(length = 60, nullable = false)
  private String lastname;

  @Column(length = 60, nullable = false)
  private String firstname;

  @Temporal(TemporalType.DATE)
  private Date birthdate;


}
