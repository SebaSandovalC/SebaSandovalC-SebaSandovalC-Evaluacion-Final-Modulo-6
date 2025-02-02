package com.edutecno.services;

import com.edutecno.model.Alumno;
import com.edutecno.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public Alumno save(Alumno alumno) {
        // Puedes agregar lógica adicional y registrar eventos con logger
        return alumnoRepository.save(alumno);
    }

    public List<Alumno> findAll() {
        return alumnoRepository.findAll();
    }
}


