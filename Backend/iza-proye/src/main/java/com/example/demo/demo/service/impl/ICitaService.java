package com.example.demo.demo.service.impl;

import com.example.demo.demo.DTO.CitaDto;

import java.util.Set;

public interface ICitaService {

    CitaDto crearCita(CitaDto citaDto);
    CitaDto leerCita (Long id);
    void modificarCita (CitaDto citaDto);
    void eliminarCita (Long id);
    Set<CitaDto> getTodos();

}
