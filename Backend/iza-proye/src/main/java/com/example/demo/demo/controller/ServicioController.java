package com.example.demo.demo.controller;


import com.example.demo.demo.DTO.ServicioDto;
import com.example.demo.demo.service.impl.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@RestController
@RequestMapping("/servicios")
public class ServicioController {

    @Autowired
    IServicioService servicioService;

    @PostMapping
    public ResponseEntity<?> crearServicio(@RequestBody ServicioDto servicioDto){
        servicioService.crearServicio(servicioDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ServicioDto getServicio(@PathVariable Long id){
        return servicioService.leerServicio(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarServicio(@RequestBody ServicioDto servicioDto){
        servicioService.modificarServicio(servicioDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarServicio(@PathVariable Long id){
        servicioService.eliminarServicio(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<ServicioDto> getTodosServicios(){
        return servicioService.getTodos();
    }

}
