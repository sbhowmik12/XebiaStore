package Driver;



import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;




@Service
public interface LoginService {

 

    public String login(String username,String password);
}
