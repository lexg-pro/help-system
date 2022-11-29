package com.helpsystem.demo.services;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



import com.helpsystem.demo.model.Solicitacao;
import com.helpsystem.demo.repository.SolicitacaoRepository;

@Service
public class SolicitacaoService {

	@Autowired
	private SolicitacaoRepository repository;

	// Listar Solicitações

	public Iterable<Solicitacao> listar() {
		return repository.findAll();

	}
	
	
	

	// Cadastrar solicitações

	public ResponseEntity<?> cadastrar(Solicitacao solicitacao) {

		if (solicitacao.getDescricao().equals("")) {
			solicitacao.setMensagem("O campo descrição é obrigatório");
			return new ResponseEntity<Solicitacao>(solicitacao, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<Solicitacao>(repository.save(solicitacao), HttpStatus.CREATED);
		}
	}
	

}
