package com.nicolas.petshopsystem.service;

import com.nicolas.petshopsystem.model.Animal;

import java.util.List;
import java.util.Optional;

public interface AnimalService {
    public Animal salvarAnimal(Animal animal);

    public List<Animal> getAllAnimais();

    public void deleteAnimal(int id);
    public Animal updateAnimal(int id, Animal animal);
    public Optional<Animal> getAnimalById(int id);
}
