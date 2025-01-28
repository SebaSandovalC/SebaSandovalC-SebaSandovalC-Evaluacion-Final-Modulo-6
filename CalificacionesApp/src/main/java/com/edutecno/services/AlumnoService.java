package com.edutecno.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.DTO.AlumnoDTO;
import com.edutecno.repositories.AlumnoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<AlumnoDTO> findAll() {
        // Obtener todos los alumnos y convertirlos a DTO
        return alumnoRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public AlumnoDTO save(AlumnoDTO alumnoDTO) {
        // Guardar un alumno desde DTO a la base de datos
        Alumno alumno = convertToEntity(alumnoDTO);
        Alumno savedAlumno = alumnoRepository.save(alumno);
        return convertToDTO(savedAlumno);
    }

    // Métodos de conversión
    private AlumnoDTO convertToDTO(Alumno alumno) {
        AlumnoDTO dto = new AlumnoDTO();
        dto.setId(alumno.getId());
        dto.setRut(alumno.getRut());
        dto.setNombre(alumno.getNombre());
        dto.setDireccion(alumno.getDireccion());

        // Convertir materias a DTO
        if (alumno.getMateriaList() != null) {
            dto.setMateriaList(alumno.getMateriaList()
                    .stream()
                    .map(materia -> {
                        MateriaDTO materiaDTO = new MateriaDTO();
                        materiaDTO.setId(materia.getId());
                        materiaDTO.setNombre(materia.getNombre());
                        materiaDTO.setAlumnoId(alumno.getId());
                        return materiaDTO;
                    })
                    .collect(Collectors.toSet())); // Recolectar como un Set<MateriaDTO>
        }

        return dto;
    }



    private Alumno convertToEntity(AlumnoDTO dto) {
        Alumno alumno = new Alumno();
        alumno.setId(dto.getId());
        alumno.setRut(dto.getRut());
        alumno.setNombre(dto.getNombre());
        alumno.setDireccion(dto.getDireccion());
        // Convertir materias de DTO a entidades (opcional)
        return alumno;
    }
}

