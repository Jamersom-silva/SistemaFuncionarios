package com.empresa.model;

import com.empresa.interfaces.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {

    public Gerente(String nome, String idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Gerente: " + getNome());
        System.out.println("Salário: " + salario);
    }

    @Override
    public void login() {
        System.out.println("Gerente " + getNome());
        System.out.println("Salario:" + salario);
    }
}