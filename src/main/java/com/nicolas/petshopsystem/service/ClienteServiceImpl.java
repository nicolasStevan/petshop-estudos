package com.nicolas.petshopsystem.service;

import com.nicolas.petshopsystem.model.Cliente;
import com.nicolas.petshopsystem.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
