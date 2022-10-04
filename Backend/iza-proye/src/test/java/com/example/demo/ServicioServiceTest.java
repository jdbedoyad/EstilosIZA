package com.example.demo;

import com.example.demo.demo.DTO.ClienteDto;
import com.example.demo.demo.DTO.ServicioDto;
import com.example.demo.demo.service.impl.IServicioService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertTrue;

@SpringBootTest
public class ServicioServiceTest {


    @Autowired
    IServicioService servicioService;

    @Test
    public void crearServicioTest(){

        ServicioDto servicioDto = new ServicioDto();
        servicioDto.setNombreServicio("Corte caballero");
        servicioDto.setCosto(15000);

        servicioService.crearServicio(servicioDto);
        ServicioDto servicioPrueba = servicioService.leerServicio(1L);
        assertTrue(servicioPrueba != null);
    }

}
