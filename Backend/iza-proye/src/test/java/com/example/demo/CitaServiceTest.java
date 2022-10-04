package com.example.demo;

import com.example.demo.demo.DTO.CitaDto;
import com.example.demo.demo.DTO.ClienteDto;
import com.example.demo.demo.DTO.ServicioDto;
import com.example.demo.demo.service.impl.ICitaService;
import com.example.demo.demo.service.impl.IClienteService;
import com.example.demo.demo.service.impl.IServicioService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.Assert.assertTrue;

@SpringBootTest
public class CitaServiceTest {

    @Autowired
    ICitaService citaService;

    @Autowired
    IClienteService clienteService;

    @Autowired
    IServicioService servicioService;

    @Test
    public void crearCitaTest(){

        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setId(22L);
        clienteDto.setNombre("Camila Andrea");
        clienteDto.setApellido("Jaramillo");
        clienteDto.setCorreo("jaramillo@gmail.com");
        clienteDto.setTelefono(777);
        ClienteDto clientePrueba = clienteService.crearCliente(clienteDto);

        ServicioDto servicioDto = new ServicioDto();
        servicioDto.setId(14L);
        servicioDto.setNombreServicio("Corte sencillo dama");
        servicioDto.setCosto(10000);

        ServicioDto servicioPrueba =servicioService.crearServicio(servicioDto);

        CitaDto cita = new CitaDto();

        cita.setCliente(clientePrueba);
        cita.setServicio(servicioPrueba);

        CitaDto citaPrueba = citaService.crearCita(cita);
        assertTrue (citaPrueba != null);
    }
}
