package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome;
    final List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

    double obterValorTotalCliente() {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.getValorTotalCompra();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", compras=" + compras +
                '}';
    }
}
