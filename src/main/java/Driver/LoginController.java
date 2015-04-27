package Driver;


 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    
    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam(value="username", required=false, defaultValue="admin") String username,@RequestParam(value="password", required=false, defaultValue="admin") String password, Model model) {
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        return loginService.login(username, password);
    }

    }


