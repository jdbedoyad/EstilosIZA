package com.example.demo.demo.service;

import com.example.demo.demo.DTO.ClienteDto;
import com.example.demo.demo.persistance.entities.Cliente;
import com.example.demo.demo.persistance.repository.IClienteRepository;
import com.example.demo.demo.service.impl.IClienteService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ClienteService  implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepository;


    @Autowired
    ObjectMapper mapper;

    @Override
    public ClienteDto crearCliente(ClienteDto clienteDto) {
        guardarCliente(clienteDto);
        return clienteDto;
    }

    @Override
    public ClienteDto leerCliente(Long id) {
        // Opcional nos permite preguntar si el objeto es o no null
        Optional<Cliente> cliente = clienteRepository.findById(id);
        ClienteDto clienteDto = null;
        if(cliente.isPresent())
            clienteDto = mapper.convertValue(cliente, ClienteDto.class);
        return  clienteDto;
    }

    public void guardarCliente(ClienteDto clienteDto){
        Cliente cliente = mapper.convertValue(clienteDto, Cliente.class);
        clienteRepository.save(cliente);
    }

    @Override
    public void modificarCliente(ClienteDto clienteDto) {
        guardarCliente(clienteDto);
    }

    @Override
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Set<ClienteDto> getTodos() {
        // Lista de clientes
        List<Cliente> clientes = clienteRepository.findAll();
        // Llenar otra lista
        Set<ClienteDto> clientesDto = new HashSet<>();

        // Recorrer la lista e ir cambiando la clase a un dto y agregarla a set
        for (Cliente cliente : clientes) {
            clientesDto.add(mapper.convertValue(cliente, ClienteDto.class));
        }
        return clientesDto;
    }
}
