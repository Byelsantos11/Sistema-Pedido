package com.example;

public class Pizza {
    private String nome;
    private String tamanho;
    private double preco;

    // Construtor
    public Pizza(String nome, String tamanho, double preco) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { 
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) { 
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) { 
        this.preco = preco;
    }

    // Método toString() para evitar a exibição do identificador de memória
    @Override
    public String toString() {
        return "Pizza: " + nome + " | Tamanho: " + tamanho + " | Preço: R$ " + preco;
    }
}
