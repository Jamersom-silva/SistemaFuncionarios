package com.empresa;

import com.empresa.model.Funcionario;
import com.empresa.model.Gerente;
import com.empresa.model.Pessoa;

public class Main {
    public static void main(String[] args) {

        pessoa f1 = new Funcionario("João", "30", 2000.00);
        pessoa g1 = new Gerente("Maria", "40", 5000.00);

        f1.mostrarInfo();
        g1.mostrarInfo();
    }
}