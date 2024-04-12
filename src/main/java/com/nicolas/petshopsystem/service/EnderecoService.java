package com.nicolas.petshopsystem.service;

import com.nicolas.petshopsystem.model.Endereco;

import java.util.List;

public interface EnderecoService {
    public Endereco salvarEndereco(Endereco endereco);

    public List<Endereco> getAllEnderecos();
}
