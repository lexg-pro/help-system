package com.helpsystem.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.helpsystem.demo.model.Funcionario;
import com.helpsystem.demo.repository.FuncionarioRepository;


@Service
public class FuncionarioService {
	@Autowired
	private FuncionarioRepository repository;
	
	
	
	
	  public Funcionario getFuncionario(Long id)
	    {
	        return repository.findById(id).orElseThrow(() -> {
	            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Id not found.");
	        });
	    }
	  
	  
}
