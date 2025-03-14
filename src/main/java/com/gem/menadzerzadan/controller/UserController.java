package com.gem.menadzerzadan.controller;

import com.gem.menadzerzadan.model.User;
import com.gem.menadzerzadan.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController // REQUEST - zadania - odbieram zadania
{

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {

        return userService.addUser(user);
    }
}
//GET Request
//POST -
//JSON {  } ->