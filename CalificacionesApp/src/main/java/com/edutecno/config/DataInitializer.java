package com.edutecno.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.edutecno.model.Alumno;
import com.edutecno.model.Materia;
import com.edutecno.repositories.AlumnoRepository;
import com.edutecno.repositories.MateriaRepository;



@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(AlumnoRepository alumnoRepository, MateriaRepository materiaRepository) {
        return args -> {
            // Crear algunos datos de prueba
            Alumno alumno1 = new Alumno();
            alumno1.setRut("12345678-9");
            alumno1.setNombre("Juan Pérez");
            alumno1.setDireccion("Calle Falsa 123");

            Materia materia1 = new Materia();
            materia1.setNombre("Matemáticas");
            materia1.setAlumno(alumno1);

            alumnoRepository.save(alumno1);
            materiaRepository.save(materia1);
        };
    }
}

