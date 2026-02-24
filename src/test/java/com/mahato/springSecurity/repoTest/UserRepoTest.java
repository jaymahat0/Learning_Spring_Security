package com.mahato.springSecurity.repoTest;

import com.mahato.springSecurity.entity.User;
import com.mahato.springSecurity.repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepoTest {

    @Autowired
    private UserRepo userRepo;

    @Test
    public void findUserByName() {
        User user = userRepo.findByUsername("alpha");
        System.out.println(user);
    }
}
