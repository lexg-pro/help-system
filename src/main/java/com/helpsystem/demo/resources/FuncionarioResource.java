package com.helpsystem.demo.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.helpsystem.demo.model.Funcionario;
import com.helpsystem.demo.model.Solicitacao;
import com.helpsystem.demo.repository.FuncionarioRepository;
import com.helpsystem.demo.services.FuncionarioService;
@CrossOrigin
@RestController
public class FuncionarioResource {
	
	@Autowired
	private FuncionarioService service;
	@Autowired
	private FuncionarioRepository repository;
	
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/usuario/cadastrarfuncionario", method =  RequestMethod.POST)
	public Funcionario Post(@Valid @RequestBody Funcionario funcionario) {
		return repository.save(funcionario);
	}
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/usuario/{id}")
    public Funcionario getArticle(@PathVariable Long id)
    {
        return service.getFuncionario(id);
    }
	
	
	@CrossOrigin(origins = "http://localhost:8080")
	 @GetMapping("/usuarios")
		public List<Funcionario> listar(){
			return repository.findAll();
		}
	

	@CrossOrigin(origins = "http://localhost:8080")
	 @GetMapping("/contagemusuarios")
	public long contagemusuarios() {
		return repository.count();
	}
	
}
