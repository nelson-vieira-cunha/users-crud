package com.example.users.infraestructure;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UsersModel {

    @Id // Marca o campo como a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática do ID
    private Long id;
    private String name;
    private Number cpf;
    private Number  idade;

    public UsersModel(String name, Number cpf, Number idade) {
        this.name = name;
        this.cpf = cpf;
        this.idade = idade;
    }

    public UsersModel() {

    }

    public Number getCpf() {
        return cpf;
    }

    public void setCpf(Number cpf) {
        this.cpf = cpf;
    }

    public Number getIdade() {
        return idade;
    }

    public void setIdade(Number idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
