package org.sdrc.bbbp.GatewayTest;

import static org.junit.Assert.assertTrue;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.authenticated;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.unauthenticated;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes= {ApiGatewayApplication.class,StartupDataEntry.class},webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
//@TestPropertySource(locations="classpath:application-test.yml")
public class ApiGatewayIntegrationTest {

//	@Autowired
	WebApplicationContext webApplicationContext;

//	@Autowired
	MockMvc mockMvc;

//	@Test
	public void accessProtected() throws Exception {
		this.mockMvc.perform(get("/")).andExpect(status().isUnauthorized());
	}

//	@Test
	public void loginUserTest() throws Exception {
		this.mockMvc.perform(get("/").with(httpBasic("bbbp_dt_kargil", "kargil123"))).andExpect(authenticated());
	}

//	@Test
	public void loginInvalidUserTest() throws Exception {
		MvcResult result = this.mockMvc.perform(formLogin().user("invalid").password("invalid")).andExpect(unauthenticated()).andExpect(status().is4xxClientError()).andReturn();
		assertTrue(result.getResponse().getContentAsString().contains("HTTP Status 401"));
	}

}
