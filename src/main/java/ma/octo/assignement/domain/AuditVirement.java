package ma.octo.assignement.domain;

import lombok.Data;
import ma.octo.assignement.domain.util.EventType;

import javax.persistence.*;

@Data
@Entity
@Table(name = "AUDIT")
public class AuditVirement {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 100)
  private String message;

  @Enumerated(EnumType.STRING)
  private EventType eventType;

}
