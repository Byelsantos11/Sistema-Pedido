package com.example.pizza;
import com.example.Atendente;
import com.example.Pedido;
import com.example.Pizza;

public class App {
    public static void main(String[] args) {
        // Criando as pizzas com os nomes corretos
        Pizza calabresa = new Pizza("Calabresa", "8 pedaços", 25.50);
        Pizza queijo = new Pizza("Queijo", "8 pedaços", 30.50); 

        // Criando o atendente com nome e salário
        Atendente atendente = new Atendente("Lucas", 1800.00);

        // Criando o pedido
        Pedido pedido = new Pedido();

        // Adicionando as pizzas ao pedido
        pedido.adicionarPizza(calabresa);
        pedido.adicionarPizza(queijo);

        // Exibindo as informações do atendente (usando toString())
        System.out.println(atendente); // Isso chama o método toString() de Atendente

        System.out.println("----------------");
        
        // Exibindo o pedido (os dados das pizzas e o total)
        pedido.ExibirPedido(); 
    }
}
