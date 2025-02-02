package com.edutecno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.model.Alumno;

@SuppressWarnings("rawtypes")
@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    // Puedes agregar métodos personalizados aquí si los necesitas
}
