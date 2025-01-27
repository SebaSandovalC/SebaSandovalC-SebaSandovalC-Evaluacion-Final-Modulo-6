package com.edutecno.services;

import com.edutecno.models.Materia;
import com.edutecno.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    public Materia save(Materia materia) {
        return materiaRepository.save(materia);
    }
}