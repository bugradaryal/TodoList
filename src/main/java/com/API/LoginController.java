package com.API;

import com.DTO.LoginDTO;
import com.Entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {
    public LoginController()
    {

    }
    @GetMapping("/Login")
    public User Login(LoginDTO loginDTO) {
        return null;
    }
}
