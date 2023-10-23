package com.expertcustom.course.config;

import com.expertcustom.course.entities.User;
import com.expertcustom.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Milena", "milena@milena", "968955645", "123456");
        User u2 = new User(null, "Andre", "Andre@hotmail.com", "968955645", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
