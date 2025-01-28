package com.edutecno.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MateriaDTO {
    private Long id;
    private String nombre;
    private Long alumnoId; // ID del alumno asociado
}

