package com.edutecno.services;

import com.edutecno.DTO.UserDTO;
import com.edutecno.models.Usuario;
import com.edutecno.repositories.UsuarioRepository;
import com.edutecno.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private AuthenticationManager authenticationManager;

    public String signin(UserDTO userDTO) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(userDTO.getUsername(), userDTO.getPassword())
        );
        return jwtTokenProvider.generateToken(authentication.getName());
    }

    public String signup(UserDTO userDTO) {
        Usuario usuario = new Usuario();
        usuario.setUsername(userDTO.getUsername());
        usuario.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        usuario.setRoles(userDTO.getRoles());
        usuarioRepository.save(usuario);
        return "Usuario registrado exitosamente";
    }
}

