package com.example.demo.demo.controller;

import com.example.demo.demo.DTO.ClienteDto;
import com.example.demo.demo.service.impl.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    IClienteService clienteService;

   @PostMapping
   public ResponseEntity<?> crearCliente(@RequestBody ClienteDto clienteDto){
       clienteService.crearCliente(clienteDto);
       return ResponseEntity.ok(HttpStatus.OK);
   }

   @GetMapping("/{id}")
    public ClienteDto getCliente(@PathVariable Long id){
       return clienteService.leerCliente(id);
   }

   @PutMapping
    public ResponseEntity<?> modificarCliente(@RequestBody ClienteDto clienteDto){
       clienteService.modificarCliente(clienteDto);
       return ResponseEntity.ok(HttpStatus.OK);
   }

   @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarCliente(@PathVariable Long id){
       clienteService.eliminarCliente(id);
       return ResponseEntity.ok(HttpStatus.OK);
   }

    @GetMapping
    public Collection<ClienteDto> getTodosClientes(){
        return clienteService.getTodos();
    }

}
