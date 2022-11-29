package com.helpsystem.demo.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
public class Solicitacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	

	private String descricao;
    private String unidade;

    private String area;

    private String regional;

    private String marca;

    private boolean elogio;

    private boolean reclamacao;

    private boolean sugestao;

    private boolean solicita;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastUpdate;
    
    
    private String fato;
    

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "funcionario_id", referencedColumnName = "id")
	private Funcionario funcionario;
	
	private String mensagem;
	
	

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isElogio() {
		return elogio;
	}

	public void setElogio(boolean elogio) {
		this.elogio = elogio;
	}

	public boolean isReclamacao() {
		return reclamacao;
	}

	public void setReclamacao(boolean reclamacao) {
		this.reclamacao = reclamacao;
	}

	public boolean isSugestao() {
		return sugestao;
	}

	public void setSugestao(boolean sugestao) {
		this.sugestao = sugestao;
	}

	public boolean isSolicita() {
		return solicita;
	}

	public void setSolicita(boolean solicita) {
		this.solicita = solicita;
	}

	public String getFato() {
		return fato;
	}

	public void setFato(String fato) {
		this.fato = fato;
	}



	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "Solicitacao [id=" + id + ", descricao=" + descricao + ", unidade=" + unidade + ", area=" + area
				+ ", regional=" + regional + ", marca=" + marca + ", elogio=" + elogio + ", reclamacao=" + reclamacao
				+ ", sugestao=" + sugestao + ", solicita=" + solicita + ", lastUpdate=" + lastUpdate + ", fato=" + fato
				+ ", funcionario=" + funcionario + ", mensagem=" + mensagem + "]";
	}


	
	
}
