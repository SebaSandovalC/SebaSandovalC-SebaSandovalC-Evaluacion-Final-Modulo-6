package com.edutecno.controllers;

import com.edutecno.DTO.MateriaDTO;
import com.edutecno.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @PostMapping
    public MateriaDTO createMateria(@RequestBody MateriaDTO materiaDTO) {
        return materiaService.save(materiaDTO);
    }
}
