package com.nicolas.petshopsystem.repository;

import com.nicolas.petshopsystem.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
