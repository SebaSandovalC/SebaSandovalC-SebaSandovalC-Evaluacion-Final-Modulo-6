package com.edutecno.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AlumnoDTO {
    private Long id;
    private String rut;
    private String nombre;
    private String direccion;
    private Set<MateriaDTO> materiaList; // Lista de materias asociadas
}

