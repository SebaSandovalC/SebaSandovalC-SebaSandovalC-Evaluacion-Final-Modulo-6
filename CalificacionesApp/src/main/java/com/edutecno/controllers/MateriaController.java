package com.edutecno.controllers;

import com.edutecno.models.Materia;
import com.edutecno.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @PostMapping
    public ResponseEntity<Materia> save(@RequestBody Materia materia) {
        Materia savedMateria = materiaService.save(materia);
        return ResponseEntity.ok(savedMateria);
    }
}
