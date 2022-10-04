package com.example.demo.demo.controller;


import com.example.demo.demo.DTO.CitaDto;
import com.example.demo.demo.service.impl.ICitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    ICitaService citaService;


    @PostMapping
    public ResponseEntity<?> crearCita(@RequestBody CitaDto citaDto){
        citaService.crearCita(citaDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public CitaDto getCita(@PathVariable Long id){
        return citaService.leerCita(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarCita(@RequestBody CitaDto citaDto){
        citaService.modificarCita(citaDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarCita(@PathVariable Long id){
        citaService.eliminarCita(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<CitaDto> getTodosCitas(){
        return citaService.getTodos();
    }
}
