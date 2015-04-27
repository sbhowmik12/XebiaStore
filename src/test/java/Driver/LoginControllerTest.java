package Driver;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.mockito.Mockito;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.*;

import static org.junit.Assert.assertEquals;

import org.mockito.MockitoAnnotations;
import org.mockito.Mock;
import org.springframework.web.context.WebApplicationContext;

import Driver.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class LoginControllerTest {
//without mocking
	
	

		
		private MockMvc mvc;

		@Autowired
		WebApplicationContext context;

		@Before
		public void setUp() {
			mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
		}

		@Test
		public void shouldPrintMessage() throws Exception {
			mvc.perform(
					MockMvcRequestBuilders
							.get("/login"))
					.andExpect(status().isOk())
					.andExpect(content().string(equalTo("successfully authenticated")));

		

	}

}
