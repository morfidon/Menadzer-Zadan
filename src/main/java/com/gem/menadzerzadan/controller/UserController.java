package com.gem.menadzerzadan.controller;

import com.gem.menadzerzadan.model.User;
import com.gem.menadzerzadan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }
    @PostMapping
    public User addUser(@RequestBody User user)
    {
        return userRepository.save(user);
    }
}
//GET Request
//POST -
//JSON {  } ->