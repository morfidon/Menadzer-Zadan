package com.gem.menadzerzadan.init;

import com.gem.menadzerzadan.model.Role;
import com.gem.menadzerzadan.model.User;
import com.gem.menadzerzadan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner
{
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public DataLoader(PasswordEncoder passwordEncoder, UserRepository userRepository)
    {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        if (userRepository.count() == 0) {
            User admin = new User("admin", passwordEncoder.encode("admin123"), "admin@gmail.com", Role.ADMIN);
            User user = new User("user", passwordEncoder.encode("user123"), "user@gmail.com", Role.USER);


            userRepository.saveAll(List.of(admin, user));
            System.out.println("Users loaded");
        }

    }
}
