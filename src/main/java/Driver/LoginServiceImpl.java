package Driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
		UserRepository repository;
		
		   public String login(String username ,String  password){
			   repository.save(new User(username,password));
			   User user=repository.findByUserName(username).get(0);
			   
			   
			   //match the password
			   if(user.getPassword().equals(password)){
				   return "successfully authenticated";
			   }
			   else{
				   return "not authenticated";
			   }
			   
	  
		        
		    }
	
}

