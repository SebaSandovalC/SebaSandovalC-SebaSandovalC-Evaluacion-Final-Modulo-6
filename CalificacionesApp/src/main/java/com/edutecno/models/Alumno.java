package com.edutecno.models;

import jakarta.persistence.*;
import java.util.Set;

@SuppressWarnings("hiding")
@Entity
public class Alumno<Materia> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rut;

    private String nombre;

    private String direccion;

    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Materia> materiaList;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<Materia> getMateriaList() {
        return materiaList;
    }

    public void setMateriaList(Set<Materia> materiaList) {
        this.materiaList = materiaList;
    }
}