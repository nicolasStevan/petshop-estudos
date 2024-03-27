package com.nicolas.petshopsystem.controller;

import com.nicolas.petshopsystem.model.Cliente;
import com.nicolas.petshopsystem.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/add")
    public String add(@RequestBody Cliente cliente){
        clienteService.salvarCliente(cliente);
        return "Novo Cliente CADASTRADO!";
    }
}
