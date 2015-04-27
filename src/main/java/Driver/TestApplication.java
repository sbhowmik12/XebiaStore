package Driver;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.mockito.Mock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class TestApplication {
	//
	// public static void main(String[] args) {
	// SpringApplication.run(TestApplication.class, args);
	// }

	@Bean
	public LoginService getMockLoginService() {
		return new LoginService() {

			@Override
			public String login(String name, String password) {

				UserRepository userRepository = getMockUserRepo(name, password);

				User user = userRepository.findByUserName(name).get(0);
				if (user.getPassword().equals(password)) {
					return "successfully authenticated";
				} else {

					return "not authenticated ";
				}
			}
		};
	}

	
	 @Bean
	 public LoginController getGreetingController(){
	 return new LoginController();
	 }
	

	public UserRepository getMockUserRepo(String name, String password) {
		List list = new ArrayList<User>();
		list.add(new User(name, password));
		UserRepository userDAO = mock(UserRepository.class);
		when(userDAO.findByUserName(name)).thenReturn(list);

		return userDAO;
	}
}