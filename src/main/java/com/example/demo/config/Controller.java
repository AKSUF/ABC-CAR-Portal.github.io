package com.example.demo.config;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Controller {
	@GetMapping
    public Principal getUser(final Principal user) {
        return user;
    }

}
