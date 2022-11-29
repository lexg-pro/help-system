package com.helpsystem.demo.services;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.helpsystem.demo.model.Funcionario;

import java.util.Collection;
import java.util.Collections;


public class CustomFuncionarioDetails implements UserDetails {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Funcionario funcionario;

    public CustomFuncionarioDetails(Funcionario funcionario) {
        super();
        this.funcionario= funcionario;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(funcionario.getRole()));
    }

    @Override
    public String getPassword() {
        return funcionario.getPassword();
    }

    @Override
    public String getUsername() {
        return funcionario.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
    
    
}