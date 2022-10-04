package com.example.demo.demo.service.impl;

import com.example.demo.demo.DTO.ServicioDto;

import java.util.Set;

public interface IServicioService {

    ServicioDto crearServicio(ServicioDto servicioDto);
    ServicioDto leerServicio (Long id);
    void modificarServicio (ServicioDto servicioDto);
    void eliminarServicio (Long id);
    Set<ServicioDto> getTodos();

}
