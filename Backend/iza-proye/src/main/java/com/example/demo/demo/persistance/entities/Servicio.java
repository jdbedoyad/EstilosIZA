package com.example.demo.demo.persistance.entities;

import javax.persistence.*;

@Entity
@Table(name = "servicios")
public class Servicio {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "servicio_sequence")
    @SequenceGenerator(name = "servicio_sequence", sequenceName = "servicio_sequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    // Estos tendrán el mismo nombre en la base de datos
    private String nombreServicio;
    private Integer costo;



    //Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }
}
