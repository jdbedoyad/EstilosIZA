package com.example.demo.demo.DTO;


import com.example.demo.demo.persistance.entities.Cliente;
import com.example.demo.demo.persistance.entities.Servicio;

public class CitaDto {

    //Atributos
    private Long id;
    private Cliente cliente;
    private Servicio servicio;

    // Getters & Setters


    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

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
}
