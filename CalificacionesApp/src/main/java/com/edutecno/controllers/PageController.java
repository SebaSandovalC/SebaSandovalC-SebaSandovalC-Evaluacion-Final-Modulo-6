package com.edutecno.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.Authentication;

@Controller
@RequestMapping("/")
public class PageController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Carga login.html
    }

    @GetMapping("/home")
    public String homePage(Authentication authentication, Model model) {
        model.addAttribute("username", authentication.getName());
        return "home"; // Carga home.html
    }
}

