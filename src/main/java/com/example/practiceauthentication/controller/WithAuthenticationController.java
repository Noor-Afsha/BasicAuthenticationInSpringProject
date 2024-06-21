package com.example.practiceauthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/with-auth")
public class WithAuthenticationController {

    @GetMapping("/authentication")
    public String WithAuthController(){
        return "Welcome to our login page";
    }
}
