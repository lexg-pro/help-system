package com.helpsystem.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.helpsystem.demo.model.Funcionario;

@CrossOrigin
@RepositoryRestResource(path="funcionario")
public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {

    Funcionario findByUsername(String username);
}