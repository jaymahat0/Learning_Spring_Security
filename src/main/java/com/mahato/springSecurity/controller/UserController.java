package com.mahato.springSecurity.controller;

import com.mahato.springSecurity.entity.User;
import com.mahato.springSecurity.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);

    @PostMapping("/reg")
    public User register(@RequestBody User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userService.registerUser(user);
    }
}
