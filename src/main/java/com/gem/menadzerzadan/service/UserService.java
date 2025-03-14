package com.gem.menadzerzadan.service;

import com.gem.menadzerzadan.model.User;
import com.gem.menadzerzadan.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService
{
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public List<User> getUsers()
    {
        return userRepository.findAll();
    }

    public User addUser(@RequestBody User user)
    {
        return userRepository.save(user);
    }
}
