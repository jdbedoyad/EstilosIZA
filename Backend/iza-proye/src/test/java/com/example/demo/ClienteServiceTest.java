package com.example.demo;

import com.example.demo.demo.DTO.ClienteDto;
import com.example.demo.demo.DTO.ServicioDto;
import com.example.demo.demo.service.impl.IClienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.Assert.assertTrue;


@SpringBootTest
public class ClienteServiceTest {

    @Autowired
    IClienteService clienteService;

    @Test
    public void crearClienteTest(){

        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setNombre("Camila");
        clienteDto.setApellido("Torres");
        clienteDto.setCorreo("ctorres@gmail.com");
        clienteDto.setTelefono(77754);

        clienteService.crearCliente(clienteDto);


        ClienteDto clientePrueba = clienteService.leerCliente(2L);
        assertTrue(clientePrueba != null);
    }
}
