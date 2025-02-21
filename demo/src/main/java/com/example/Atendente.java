package com.example;

public class Atendente extends Funcionario {

    public Atendente(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescrevendo o toString() para exibir informações específicas do Atendente
    @Override
    public String toString() {
        return "Atendente: " + getNome() + " | Salário: R$ " + getSalario();
    }
}
