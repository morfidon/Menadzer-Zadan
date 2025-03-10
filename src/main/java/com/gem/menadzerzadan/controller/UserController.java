package com.gem.menadzerzadan.controller;

import com.gem.menadzerzadan.model.User;
import com.gem.menadzerzadan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }
}
//J