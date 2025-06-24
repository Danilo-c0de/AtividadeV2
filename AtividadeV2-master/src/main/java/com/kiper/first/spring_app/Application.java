package com.kiper.first.spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marca a classe como a principal para a inicialização da aplicação Spring Boot
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // Inicia a aplicação Spring Boot
        SpringApplication.run(Application.class, args);
    }

}
