package com.example.demo.demo.DTO;


public class CitaDto {

    //Atributos
    private Long id;
    private ClienteDto cliente;
    private ServicioDto servicio;

    // Getters & Setters


    public ServicioDto getServicio() {
        return servicio;
    }

    public void setServicio(ServicioDto servicio) {
        this.servicio = servicio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClienteDto getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDto cliente) {
        this.cliente = cliente;
    }
}
