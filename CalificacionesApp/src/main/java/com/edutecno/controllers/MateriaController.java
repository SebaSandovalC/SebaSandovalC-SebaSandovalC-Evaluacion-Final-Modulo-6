package com.edutecno.controllers;

import com.edutecno.model.Materia;
import com.edutecno.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @PostMapping
    public Materia save(@RequestBody Materia materia){
        return materiaService.save(materia);
    }
}

