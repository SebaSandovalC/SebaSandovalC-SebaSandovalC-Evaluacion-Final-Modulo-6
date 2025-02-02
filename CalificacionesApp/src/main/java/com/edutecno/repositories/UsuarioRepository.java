package com.edutecno.repositories;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import com.edutecno.model.Usuario;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}


