package com.helpsystem.demo.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.helpsystem.demo.model.Solicitacao;
import com.helpsystem.demo.repository.SolicitacaoRepository;
import com.helpsystem.demo.services.SolicitacaoService;

@RestController
public class SolicitacaoResource {
	
	@SuppressWarnings("unused")
	@Autowired
	private SolicitacaoService service;
	
	@Autowired
	private SolicitacaoRepository repository;
	
	//Método Listar
	 @CrossOrigin
	@GetMapping("/listar")
	public List<Solicitacao> listar(){
		return repository.findAll();
	}
	 @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value = "/cadastrarsolicitacao", method =  RequestMethod.POST)
    public Solicitacao Post(@Valid @RequestBody Solicitacao solicitacao)
    {
        return   repository.save(solicitacao);
    }
	 @CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/listar/{id}")
	public ResponseEntity<Solicitacao> buscarPorId(@PathVariable Long id){
		return ResponseEntity.ok().body(repository.findById(id).get());
	}
	
	 @CrossOrigin(origins = "http://localhost:8080")
	 @GetMapping("/contagemsolicitacoes")
	 public long contador() {
		 return repository.count();
	 }
	 
}
	
	
