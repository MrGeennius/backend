 package web40.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import web40.demo.model.User;
import web40.demo.service.LoginService;


@RestController
@CrossOrigin(origins ={"https://jay-portfolio-316f2.web.app"})
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        loginService.addUser(user);
        return "exitoso.";
    }

    @PostMapping("/login")
    public boolean login(@RequestBody User user){
        return loginService.checkLogin(user);
    }

}