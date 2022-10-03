package com.example.demo.demo.DTO;


import com.example.demo.demo.persistance.entities.Cliente;

public class CitaDto {

    //Atributos
    private Long id;
    private Cliente cliente;

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
}
