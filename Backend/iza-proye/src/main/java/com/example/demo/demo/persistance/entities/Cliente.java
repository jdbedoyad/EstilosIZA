package com.example.demo.demo.persistance.entities;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    //Private
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_sequence")
    @SequenceGenerator(name = "cliente_sequence", sequenceName = "cliente_sequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    // Estos tendrán el mismo nombre en la base de datos
    private String nombre;
    private String apellido;
    private String correo;
    private Integer telefono;

    //Constructor vacío

    public Cliente() {
    }

    //Constructor sin id
    public Cliente(String nombre, String apellido, String correo, Integer telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    //Constructor con id
    public Cliente(Long id, String nombre, String apellido, String correo, Integer telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }


// Getters & Setters

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

}
