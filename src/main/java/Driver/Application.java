package Driver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@Configuration
//@ComponentScan(value={"com.xebia"})
@SpringBootApplication
public class Application {

	@Autowired
    UserRepository repository;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    
    /*public void run(String... strings) throws Exception {
    	//save a couple of customers
        repository.save(new User("Admin","password"));
    	User customer=(User) repository.findAll();
            System.out.println(customer);
    }*/
}