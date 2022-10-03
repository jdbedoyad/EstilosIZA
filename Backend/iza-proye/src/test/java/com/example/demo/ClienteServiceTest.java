/* package com.example.demo;

import com.example.demo.demo.DTO.ClienteDto;
import com.example.demo.demo.service.impl.IClienteService;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteServiceTest {

    @Autowired
    IClienteService clienteService;

    @Test
    public void crearClienteTest(){

        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setNombre("Gabriel");
        clienteDto.setApellido("García Marquez");
        clienteDto.setEmail("ggm@gmail.com");
        clienteDto.setTelefono(123455654);

        clienteService.crearCliente(clienteDto);

        ClienteDto clienteGabriel = clienteService.leerCliente(1L);
        assertTrue(clienteGabriel != null);
    }



}
*/