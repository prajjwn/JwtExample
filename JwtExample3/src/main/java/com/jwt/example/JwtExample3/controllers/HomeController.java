package com.jwt.example.JwtExample3.controllers;

import com.jwt.example.JwtExample3.models.User;
import com.jwt.example.JwtExample3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        System.out.println("Getting users");
        return userService.getStore();
    }

    @GetMapping("current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}