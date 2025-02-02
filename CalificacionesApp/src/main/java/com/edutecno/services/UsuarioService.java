package com.edutecno.services;

import com.edutecno.DTO.UserDTO;
import com.edutecno.model.Usuario;
import com.edutecno.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UserDTO> findAll() {
        return usuarioRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public UserDTO save(UserDTO userDTO) {
        Usuario usuario = new Usuario();
        usuario.setUsername(userDTO.getUsername());
        usuario.setPassword(userDTO.getPassword());
        usuario.setRoles(userDTO.getRoles());
        Usuario savedUsuario = usuarioRepository.save(usuario);
        return convertToDTO(savedUsuario);
    }

    private UserDTO convertToDTO(Usuario usuario) {
        UserDTO dto = new UserDTO();
        dto.setUsername(usuario.getUsername());
        dto.setRoles(usuario.getRoles());
        return dto;
    }
}
