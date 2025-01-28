package com.edutecno.repositories;

import com.edutecno.models.Alumno; // Verifica que esta importación esté correcta
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("rawtypes")
@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    // Puedes agregar métodos personalizados aquí si los necesitas
}
