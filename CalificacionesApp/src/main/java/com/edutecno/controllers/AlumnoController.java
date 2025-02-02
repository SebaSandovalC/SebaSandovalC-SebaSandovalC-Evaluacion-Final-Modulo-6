package com.edutecno.controllers;

import com.edutecno.model.Alumno;
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
    public List<Alumno> findAll(){
        return alumnoService.findAll();
    }

    @PostMapping
    public Alumno save(@RequestBody Alumno alumno){
        return alumnoService.save(alumno);
    }
}
