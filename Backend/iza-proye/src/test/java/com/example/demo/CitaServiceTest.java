package com.example.demo;

import com.example.demo.demo.DTO.CitaDto;
import com.example.demo.demo.DTO.ClienteDto;
import com.example.demo.demo.DTO.ServicioDto;
import com.example.demo.demo.service.impl.ICitaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertTrue;

@SpringBootTest
public class CitaServiceTest {

    @Autowired
    ICitaService citaService;

    @Test
    public void crearCitaTest(){

        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setNombre("Andres");
        clienteDto.setApellido("Muñoz");
        clienteDto.setCorreo("amu@gmail.com");
        clienteDto.setTelefono(77754);


        ServicioDto servicioDto = new ServicioDto();
        servicioDto.setNombreServicio("Corte caballero");
        servicioDto.setCosto(15000);


        CitaDto citaPrueba = citaService.leerCita(1L);
        assertTrue(citaPrueba != null);
    }
}
