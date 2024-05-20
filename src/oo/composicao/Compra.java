package oo.composicao;

import java.util.ArrayList;

//RELACIONAMENTO UM PRA N -> ONE TO MANY
public class Compra {
    String cliente;
    ArrayList<Item> adicionarItem = new ArrayList<Item>();
    //MÉTODOS PARA MANTER UMA RELAÇÃO BIDIRECIONAL CONSISTENTE
    void adicionarItem(Item item) {
        adicionarItem.add(item);
        item.compra = this;
    }
    //MÉTODOS PARA MANTER UMA RELAÇÃO BIDIRECIONAL CONSISTENTE
    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    double getValorTotal() {
        double total = 0;
        for (Item item : adicionarItem) {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
