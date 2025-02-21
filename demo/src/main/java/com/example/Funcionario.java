package com.example;

public class Funcionario {
    private String nome;
    private double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para exibir informações do funcionário
    public void exibirFuncionario() {
        System.out.println(this.toString()); // Usa o método toString() para exibir
    }

    // Método toString() para representar o funcionário como string
    @Override
    public String toString() {
        return "Funcionário: " + nome + " | Salário: R$ " + salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { // Corrigido: setNome() com letra minúscula
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) { // Corrigido: setSalario() com letra minúscula
        this.salario = salario;
    }
}
