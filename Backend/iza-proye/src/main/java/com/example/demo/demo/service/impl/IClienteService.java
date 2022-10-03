package com.example.demo.demo.service.impl;

import com.example.demo.demo.DTO.ClienteDto;

import java.util.Set;

public interface IClienteService {

    void crearCliente(ClienteDto clienteDto);
    ClienteDto leerCliente (Long id);
    void modificarCliente (ClienteDto clienteDto);
    void eliminarCliente (Long id);
    Set<ClienteDto> getTodos();

}
