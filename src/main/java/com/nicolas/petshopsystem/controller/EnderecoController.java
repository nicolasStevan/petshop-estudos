package com.nicolas.petshopsystem.controller;

import com.nicolas.petshopsystem.model.Endereco;
import com.nicolas.petshopsystem.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/add")
    public String add(@RequestBody Endereco endereco){
        enderecoService.salvarEndereco(endereco);
        return "Novo Endereço Cadastrado com Sucesso";
    }

    @GetMapping("/getAll")
    public List<Endereco>getAllEndereco(){
        return enderecoService.getAllEnderecos();
    }

}
