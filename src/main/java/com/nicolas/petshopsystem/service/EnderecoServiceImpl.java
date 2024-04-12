package com.nicolas.petshopsystem.service;

import com.nicolas.petshopsystem.model.Cliente;
import com.nicolas.petshopsystem.model.Endereco;
import com.nicolas.petshopsystem.repository.ClienteRepository;
import com.nicolas.petshopsystem.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceImpl implements EnderecoService{
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public Endereco salvarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    @Override
    public List<Endereco> getAllEnderecos() {
        return enderecoRepository.findAll();
    }

}
