package com.nicolas.petshopsystem.repository;

import com.nicolas.petshopsystem.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>  {

    Cliente findByNomeAndCpf(String nome, String cpf);
}
