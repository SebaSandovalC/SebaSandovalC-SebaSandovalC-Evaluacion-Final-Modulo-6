package com.edutecno.services;

import com.edutecno.DTO.MateriaDTO;
import com.edutecno.models.Materia;
import com.edutecno.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    public MateriaDTO save(MateriaDTO materiaDTO) {
        Materia materia = new Materia();
        materia.setNombre(materiaDTO.getNombre());
        Materia savedMateria = materiaRepository.save(materia);

        MateriaDTO response = new MateriaDTO();
        response.setId(savedMateria.getId());
        response.setNombre(savedMateria.getNombre());
        return response;
    }
}

