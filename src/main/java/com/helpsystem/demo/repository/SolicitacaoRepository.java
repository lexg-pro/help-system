package com.helpsystem.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.helpsystem.demo.model.*;

@CrossOrigin
@RepositoryRestResource(path="solicitacao")
public interface SolicitacaoRepository extends JpaRepository<Solicitacao,Long> {


}
