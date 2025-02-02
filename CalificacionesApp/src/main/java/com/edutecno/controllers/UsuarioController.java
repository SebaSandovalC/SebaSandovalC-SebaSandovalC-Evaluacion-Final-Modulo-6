package com.edutecno.controllers;

import com.edutecno.DTO.UserDTO;
import com.edutecno.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UserDTO> getAllUsuarios() {
        return usuarioService.findAll();
    }

    @PostMapping
    public UserDTO createUsuario(@RequestBody UserDTO userDTO) {
        return usuarioService.save(userDTO);
    }
}

