package com.nicolas.petshopsystem.controller;

import com.nicolas.petshopsystem.model.Cliente;
import com.nicolas.petshopsystem.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/getAll")
    public List<Cliente>getAllClientes(){
        return clienteService.getAllClientes();
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Cliente cliente) {
        Cliente clienteAutenticado = clienteService.findByNomeAndCpf(cliente.getNome(), cliente.getCpf());
        if (clienteAutenticado != null) {
            return ResponseEntity.ok("Login bem-sucedido. ID do Cliente: " + clienteAutenticado.getId_cliente());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais inválidas");
        }
    }

}
