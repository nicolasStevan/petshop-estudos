package com.nicolas.petshopsystem.service;

import com.nicolas.petshopsystem.model.Cliente;
import com.nicolas.petshopsystem.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }
    @Override
    public Cliente findByNomeAndCpf(String nome, String cpf) {
        return clienteRepository.findByNomeAndCpf(nome, cpf);
    }
    @Override
    public Cliente login(String nome, String cpf) {
        return clienteRepository.findByNomeAndCpf(nome, cpf);
    }
}
