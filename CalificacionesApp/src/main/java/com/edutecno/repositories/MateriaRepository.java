package com.edutecno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edutecno.models.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
}