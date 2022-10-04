package com.example.demo.demo.persistance.entities;

import javax.persistence.*;

@Entity
@Table(name = "citas")
public class Cita {
   //Atributos
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cita_sequence")
   @SequenceGenerator(name = "cita_sequence", sequenceName = "cita_sequence", allocationSize = 1)
   @Column(name = "id", nullable = false)
   private Long id;

    // Relación muchos a uno: Muchos citas pueden tener un mismo cliente
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    // Relación muchos a uno: Muchos citas pueden tener un mismo servicio
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "servicio_id", nullable = false)
    private Servicio servicio;


    // El cliente puede querer varios servicios, así que van en una lista
    //private Set<Servivio> servivios;

    //Constructor vacío
    public Cita() {
    }

    // Constructor sin id
    public Cita(Cliente cliente, Servicio servicio) {
        this.cliente = cliente;
        this.servicio = servicio;
    }

    //Constructor con id
    public Cita(Long id, Cliente cliente, Servicio servicio) {
        this.id = id;
        this.cliente = cliente;
        this.servicio = servicio;
    }


    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
