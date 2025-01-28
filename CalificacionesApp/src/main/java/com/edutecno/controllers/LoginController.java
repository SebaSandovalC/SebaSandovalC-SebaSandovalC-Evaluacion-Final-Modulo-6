package com.edutecno.controllers;

import com.edutecno.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signin")
    public String login(@RequestBody UserDTO userDTO) {
        return authService.signin(userDTO);
    }

    @PostMapping("/signup")
    public String register(@RequestBody UserDTO userDTO) {
        return authService.signup(userDTO);
    }
}

