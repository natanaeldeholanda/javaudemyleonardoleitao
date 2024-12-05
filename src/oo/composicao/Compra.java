package oo.composicao;

import java.util.ArrayList;

//RELACIONAMENTO UM PRA N -> ONE TO MANY
public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    //MÉTODOS PARA MANTER UMA RELAÇÃO BIDIRECIONAL CONSISTENTE
    void adicionarItem(Item item) {
        itens.add(item);
        item.compra = this;
    }
    //MÉTODOS PARA MANTER UMA RELAÇÃO BIDIRECIONAL CONSISTENTE
    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    double getValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
