package com.nicolas.petshopsystem.service;

import com.nicolas.petshopsystem.model.Animal;
import com.nicolas.petshopsystem.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
   @Override
   public  void deleteAnimal(int id){
        animalRepository.deleteById(id);
   }
    @Override
    public Animal updateAnimal(int id, Animal animal) {
        Animal animalToUpdate = animalRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Animal não encontrado"));

        animalToUpdate.setNome(animal.getNome());
        animalToUpdate.setRaca(animal.getRaca());
        animalToUpdate.setPeso(animal.getPeso());

        return animalRepository.save(animalToUpdate);
    }
    @Override
    public Optional<Animal> getAnimalById(int id) {
        return animalRepository.findById(id);
    }

}
