package com.pacientes.historial.domain.Model.Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pacientes")
public class PacienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer edad;
    private String historial;
    private String tratamiento;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    // Constructor vacío
    public PacienteEntity() {}

    // Constructor completo
    public PacienteEntity(Long id, String nombre, Integer edad, String historial, String tratamiento, Date fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.historial = historial;
        this.tratamiento = tratamiento;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
