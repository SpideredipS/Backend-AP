package com.proyectofinal.portfolio;

import com.proyectofinal.portfolio.model.Login;
import com.proyectofinal.portfolio.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class LoginResource {
    @Autowired
    LoginService loginService;
    
    @PostMapping("/login")
    public boolean login(@RequestBody Login login) {
        return loginService.isUserEnabled(login);
    }
}