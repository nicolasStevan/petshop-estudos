package com.nicolas.petshopsystem.controller;

import com.nicolas.petshopsystem.model.Animal;
import com.nicolas.petshopsystem.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/show/{id}")
    public ResponseEntity<Animal> show(@PathVariable int id){
        Optional<Animal> animal = animalService.getAnimalById(id);
        return animal.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAnimal(@PathVariable int id){
        animalService.deleteAnimal(id);
        return ResponseEntity.ok("Animal Excluido com sucesso!");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateAnimal(@PathVariable int id, @RequestBody Animal animal){
        animalService.updateAnimal(id, animal);
        return ResponseEntity.ok("Animal Atualizado com Sucesso");
    }

}
