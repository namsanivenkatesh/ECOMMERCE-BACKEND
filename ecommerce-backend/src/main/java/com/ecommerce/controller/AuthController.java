package com.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        // Implement JWT generation logic based on username and password
        return "JWT token";
    }
}
