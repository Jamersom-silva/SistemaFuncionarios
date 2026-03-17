package com.empresa.model;

public abstract class pessoa {

    private String nome;
    private String idade;

    public pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public abstract void mostrarInfo();
}