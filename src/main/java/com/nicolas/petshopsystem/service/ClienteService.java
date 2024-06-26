package com.nicolas.petshopsystem.service;

import com.nicolas.petshopsystem.model.Cliente;

import java.util.List;

public interface ClienteService {
    public Cliente salvarCliente(Cliente cliente);

    public List<Cliente> getAllClientes();

    public Cliente findByNomeAndCpf(String nome, String cpf);

    public Cliente login(String nome, String cpf);
}
