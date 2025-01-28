package com.edutecno.repositories;

import com.edutecno.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Método para buscar un usuario por su nombre de usuario
    Optional<Usuario> findByUsername(String username);

    // Verificar si un usuario ya existe por su nombre de usuario
    boolean existsByUsername(String username);
}

