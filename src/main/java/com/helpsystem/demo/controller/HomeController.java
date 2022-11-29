package com.helpsystem.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@CrossOrigin
    @GetMapping("/home")
    public String home(){
        return "/home";
    }
    @CrossOrigin
    @GetMapping("/admin")
    public String admin(){
        return "This is Admin Page";
    }
    
}