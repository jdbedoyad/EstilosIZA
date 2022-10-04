package com.example.demo.demo.service;

import com.example.demo.demo.DTO.ServicioDto;
import com.example.demo.demo.persistance.entities.Servicio;
import com.example.demo.demo.persistance.repository.IServicioRepository;
import com.example.demo.demo.service.impl.IServicioService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ServicioService implements IServicioService {

    @Autowired
    private IServicioRepository servicioRepository;


    @Autowired
    ObjectMapper mapper;

    public void guardarServicio(ServicioDto servicioDto){
        Servicio servicio = mapper.convertValue(servicioDto, Servicio.class);
        servicioRepository.save(servicio);
    }


    @Override
    public void crearServicio(ServicioDto servicioDto) {
        guardarServicio(servicioDto);
    }

    @Override
    public ServicioDto leerServicio(Long id) {
// Opcional nos permite preguntar si el objeto es o no null
        Optional<Servicio> servicio = servicioRepository.findById(id);
        ServicioDto servicioDto = null;
        if(servicio.isPresent())
            servicioDto = mapper.convertValue(servicio, ServicioDto.class);
        return  servicioDto;
    }

    @Override
    public void modificarServicio(ServicioDto servicioDto) {
        guardarServicio(servicioDto);
    }

    @Override
    public void eliminarServicio(Long id) {
        servicioRepository.deleteById(id);
    }

    @Override
    public Set<ServicioDto> getTodos() {
        // Lista de servicios
        List<Servicio> servicios = servicioRepository.findAll();
        // Llenar otra lista
        Set<ServicioDto> serviciosDto = new HashSet<>();

        // Recorrer la lista e ir cambiando la clase a un dto y agregarla a set
        for (Servicio servicio : servicios) {
            serviciosDto.add(mapper.convertValue(servicio, ServicioDto.class));
        }
        return serviciosDto;
    }
}
