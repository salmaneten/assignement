package ma.octo.assignement;

import ma.octo.assignement.dto.VersementDto;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class AssignementApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	VersementDto versementDto;



	@Test
	void testCreateTransactionVersement() throws  Exception{

		String versementPayload = "{\"montantVersement\" : \"2000\",\"dateExecution\": \"2020-12-04\",\"nom_prenom_emetteur\": \"salmane\",\"ribCompteBeneficiaire\": \"RIB1\",\"motifVersement\": \"Assignment 2021\"}";
		mockMvc.perform(
				MockMvcRequestBuilders.post("/versements/")
		.contentType(MediaType.APPLICATION_JSON)
		.content(versementPayload)
		).andExpect(MockMvcResultMatchers.status().isCreated());
	}
	@Test
	void testCreateTransaction_ShouldReturnBadRequest_WhenMontantVersementIsNotValid() throws Exception {
		String versementPayload = "{\"montantVersement\" : \"9\",\"dateExecution\": \"2020-12-04\",\"nom_prenom_emetteur\": \"salmane\",\"ribCompteBeneficiaire\": \"RIB1\",\"motifVersement\": \"Assignment 2021\"}";
		mockMvc.perform(
				MockMvcRequestBuilders.post("/versements/")
						.contentType(MediaType.APPLICATION_JSON)
						.content(versementPayload)
		).andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

}
