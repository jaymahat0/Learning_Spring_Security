package com.mahato.springSecurity.service;

import com.mahato.springSecurity.entity.User;
import com.mahato.springSecurity.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User registerUser(User user) {
        return userRepo.save(user);
    }
}
