package com.helpsystem.demo.model;

import java.util.List;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="funcionario")
public class Funcionario {

    @Id
    private Long id;
    private String username;
    private String password;
    
    private String role;
    
	@JsonIgnore
    @OneToMany(mappedBy = "funcionario")
    private List<Solicitacao> solicitacoes;
   
    
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", solicitacoes=" + solicitacoes + "]";
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

	public List<Solicitacao> getSolicitacoes() {
		return solicitacoes;
	}

	public void setSolicitacoes(List<Solicitacao> solicitacoes) {
		this.solicitacoes = solicitacoes;
	}
    
    
}
