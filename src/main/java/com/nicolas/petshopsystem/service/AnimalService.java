package com.nicolas.petshopsystem.service;

import com.nicolas.petshopsystem.model.Animal;

import java.util.List;

public interface AnimalService {
    public Animal salvarAnimal(Animal animal);

    public List<Animal> getAllAnimais();

    public void deleteAnimal(int id);
}
