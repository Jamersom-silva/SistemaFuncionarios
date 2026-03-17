package com.empresa.model;

public class Funcionario extends pessoa {
    protected double salario;

    public Funcionario(String nome, String idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    @override
    public void mostrarInfo() {
        System.out.println("Funcionario:" + getNome());
        System.out.println("Salário: " + salario);
    }
}