package com.edutecno.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.edutecno.model.Alumno;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MateriaDTO {
    private Long id;
    private String nombre;
    private Alumno alumno;
}


