package ma.octo.assignement.repository;

import ma.octo.assignement.domain.Compte;
import ma.octo.assignement.domain.Virement;
import org.junit.Assert;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class VirementRepositoryTest {

  @Autowired
  private VirementRepository virementRepository;

  @Test
  @Order(3)
  public void findOne() {

    Virement virementRep = virementRepository.getById(1L);
    Assert.assertNotNull(virementRep);
    Assert.assertTrue(virementRep.getId().equals(1L));



  }

  @Test
  @Order(2)
  public void findAll() {
    List<Virement> allVirements = virementRepository.findAll();
    Assert.assertNotNull(allVirements);
    Assert.assertFalse(allVirements.isEmpty());

  }

  @Test
  @Order(1)
  public void save() {
    Virement virement = new Virement();
    virement.setId(5L);
    virement.setDateExecution(new Date());
    virement.setCompteEmetteur(new Compte());
    virement.setCompteBeneficiaire(new Compte());
    virement.setMotifVirement("assignment 2021");
    virement.setMontantVirement(new BigDecimal("100"));
    virementRepository.save(virement);
    Assert.assertTrue(virement.getId()>0);
    Assert.assertNotNull(virementRepository.getById(5L));

  }

  @Test
  @Order(4)
  public void delete() {

    virementRepository.deleteById(5L);
    Assert.assertFalse(virementRepository.existsById(5L));

  }
}