package com.edutecno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edutecno.models.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
