package com.kiper.first.spring_app.service;

import org.springframework.stereotype.Service;

@Service // Indica ao Spring que esta é uma classe de serviço
public class HelloWorldService {

    // Método que retorna a saudação com o nome fornecido
    public String helloWorld(String name) {
        // Retorna "Hello Mundo!" seguido do nome fornecido
        return "Hello Mundo! " + name; 
    }
}
