package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade) {
        this.itens.add(new Item(produto, quantidade));
    }

    void adicionarItem2(String nome, double preco, int quantidade) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));
    }

    double getValorTotalCompra() {
        double total = 0;
        for (Item item : this.itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Compra{" +
                itens +
                '}';
    }
}
