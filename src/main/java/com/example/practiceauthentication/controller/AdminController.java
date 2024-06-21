package com.example.practiceauthentication.controller;

import com.example.practiceauthentication.model.User;
import com.example.practiceauthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class AdminController {
    @Autowired
    private UserRepository userRepository;

    //by using thi able to encrypt our password otherwise if the password which will stre in db can
    //not be in encrypted form,that's why using "BCryptPasswordEncoder"
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/admin")
    public String addUserByAdmin(@RequestBody User user) {
        userRepository.save(user);
        return "user added successfully";

    }
}
