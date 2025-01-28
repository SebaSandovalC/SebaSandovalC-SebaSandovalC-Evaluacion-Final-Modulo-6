package com.edutecno.controllers;

import com.edutecno.DTO.AlumnoDTO;
import com.edutecno.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<AlumnoDTO> getAllAlumnos() {
        return alumnoService.findAll();
    }

    @PostMapping
    public AlumnoDTO createAlumno(@RequestBody AlumnoDTO alumnoDTO) {
        return alumnoService.save(alumnoDTO);
    }
}
