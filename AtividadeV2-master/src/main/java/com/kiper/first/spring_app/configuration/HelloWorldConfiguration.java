package com.kiper.first.spring_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Define a classe como configuração do Spring
@Configuration  
public class HelloWorldConfiguration {

    // Define um bean que o Spring irá gerenciar
    @Bean  
    public String helloWorld() { 
        // Retorna a mensagem "Hello World"
        return "Hello World";  
    }
}
