package com.example.practiceauthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/no-auth")
public class NoAuthController {

    @GetMapping("/password0")
    public String withoutAuth(){
        return "No password";
    }
}
