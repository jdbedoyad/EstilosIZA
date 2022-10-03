package com.example.demo.demo.service;
import com.example.demo.demo.DTO.CitaDto;
import com.example.demo.demo.persistance.entities.Cita;
import com.example.demo.demo.persistance.repository.ICitaRepository;
import com.example.demo.demo.service.impl.ICitaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CitaService implements ICitaService {

    @Autowired
    private ICitaRepository citaRepository;


    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearCita(CitaDto citaDto) {
        guardarCita(citaDto);
    }

    public void guardarCita(CitaDto citaDto){
        Cita cita = mapper.convertValue(citaDto, Cita.class);
        citaRepository.save(cita);
    }

    @Override
    public CitaDto leerCita(Long id) {
        // Opcional nos permite preguntar si el objeto es o no null
        Optional<Cita> cliente = citaRepository.findById(id);
        CitaDto citaDto = null;
        if(cliente.isPresent())
            citaDto = mapper.convertValue(cliente, CitaDto.class);
        return  citaDto;
    }


    @Override
    public void modificarCita(CitaDto citaDto) {
        guardarCita(citaDto);
    }

    @Override
    public void eliminarCita(Long id) {
        citaRepository.deleteById(id);
    }

    @Override
    public Set<CitaDto> getTodos() {
        // Lista de clientes
        List<Cita> citas = citaRepository.findAll();
        // Llenar otra lista
        Set<CitaDto> citaDto = new HashSet<>();

        // Recorrer la lista e ir cambiando la clase a un dto y agregarla a set
        for (Cita cita : citas) {
            citaDto.add(mapper.convertValue(cita, CitaDto.class));
        }
        return citaDto;
    }
}
