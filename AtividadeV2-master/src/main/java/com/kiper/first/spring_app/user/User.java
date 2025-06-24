package com.kiper.first.spring_app.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Lombok gera automaticamente os métodos getter, setter e o construtor
@Getter // Gera o método getter para todos os campos
@Setter // Gera o método setter para todos os campos
@AllArgsConstructor // Gera um construtor com todos os campos como parâmetros
public class User {
    private String nome;  // Nome do usuário
    private String email; // E-mail do usuário
}
