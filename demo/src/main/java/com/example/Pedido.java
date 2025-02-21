package com.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

//List para pode adicionar pizzas
private List<Pizza> pizzas = new ArrayList<>();


//Constructor vazio 
public Pedido(){};

//Método adicionar
public void adicionarPizza(Pizza pizza){
    pizzas.add(pizza);
}

//Método deletar
public void deletarPizza(Pizza pizza){
    pizzas.remove(pizza);
}

//Método calcular valor
public double calcularTotal(){
    double total = 0;

  for(Pizza pizza : pizzas){
    total += pizza.getPreco();
}
    return total;
}


//Método exibir Pedido
public void ExibirPedido(){
    for (Pizza pizza: pizzas){
        System.out.println(pizza.toString());
    }

    System.out.println("Valor Total R$:" + calcularTotal());
}

  
}
