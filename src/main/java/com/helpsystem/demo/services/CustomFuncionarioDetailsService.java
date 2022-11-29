package com.helpsystem.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.helpsystem.demo.model.Funcionario;

import com.helpsystem.demo.repository.FuncionarioRepository;

@Service
public class CustomFuncionarioDetailsService implements UserDetailsService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Funcionario funcionario = funcionarioRepository.findByUsername(username);
        if(funcionario ==null) {
            throw new UsernameNotFoundException("User Not Found");
        }
        return new CustomFuncionarioDetails(funcionario);
    }
}