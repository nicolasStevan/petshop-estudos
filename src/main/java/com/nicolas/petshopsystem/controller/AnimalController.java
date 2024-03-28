package com.nicolas.petshopsystem.controller;

import com.nicolas.petshopsystem.model.Animal;
import com.nicolas.petshopsystem.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @PostMapping("/add")
    public String add(@RequestBody Animal animal){
        animalService.salvarAnimal(animal);
        return "Novo Animal Cadastrado no sistema !";
    }

    @GetMapping("/getAll")
    public List<Animal>getAllAnimais(){
        return animalService.getAllAnimais();
    }
}
