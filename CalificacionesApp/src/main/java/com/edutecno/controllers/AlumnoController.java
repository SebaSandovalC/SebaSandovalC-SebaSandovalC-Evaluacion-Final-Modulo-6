package com.edutecno.controllers;

import com.edutecno.models.Alumno;
import com.edutecno.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @PostMapping
    public ResponseEntity<Alumno> save(@RequestBody Alumno alumno) {
        Alumno savedAlumno = alumnoService.save(alumno);
        return ResponseEntity.ok(savedAlumno);
    }

    @GetMapping
    public ResponseEntity<List<Alumno>> findAll() {
        List<Alumno> alumnos = alumnoService.findAll();
        return ResponseEntity.ok(alumnos);
    }
}
