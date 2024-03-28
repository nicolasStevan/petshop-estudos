package com.nicolas.petshopsystem.service;

import com.nicolas.petshopsystem.model.Animal;
import com.nicolas.petshopsystem.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public Animal salvarAnimal(Animal animal){
        return animalRepository.save(animal);
    }
    @Override
    public List<Animal> getAllAnimais(){
        return animalRepository.findAll();
    }
}
