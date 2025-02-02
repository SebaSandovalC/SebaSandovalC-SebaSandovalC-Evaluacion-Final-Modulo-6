package com.edutecno.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;
import com.edutecno.model.Materia;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDTO {
    private Long id;
    private String rut;
    private String nombre;
    private String direccion;
    private Set<Materia> materiaList;
}

