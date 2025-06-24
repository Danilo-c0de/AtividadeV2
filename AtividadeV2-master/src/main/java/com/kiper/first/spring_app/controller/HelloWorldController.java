package com.kiper.first.spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiper.first.spring_app.service.HelloWorldService;
import com.kiper.first.spring_app.user.User;

@RestController
@RequestMapping("/Hello_World")
@CrossOrigin(origins = "*")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Danilo");  // Retorna a saudação com o nome Danilo
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestBody User body) {
        return "Hello " + body.getNome() + " " + id;  // Retorna "Hello {nome} {id}" 
    }
}
