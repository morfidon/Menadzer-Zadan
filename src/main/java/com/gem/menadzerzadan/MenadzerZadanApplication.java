package com.gem.menadzerzadan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MenadzerZadanApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenadzerZadanApplication.class, args);
    }
    @GetMapping("/home")
    public String home() {
        return "Hello World!";
    }

}
