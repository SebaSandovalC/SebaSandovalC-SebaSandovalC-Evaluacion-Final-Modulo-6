package com.edutecno.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @SuppressWarnings("rawtypes")
	@ManyToOne
    @JoinColumn(name = "alumno_id")
    private Alumno alumno;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @SuppressWarnings("rawtypes")
	public Alumno getAlumno() {
        return alumno;
    }

    @SuppressWarnings("rawtypes")
	public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}

