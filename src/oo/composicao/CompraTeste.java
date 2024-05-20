package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "Natanael";
        compra1.adicionarItem("Caneta", 3, 2.5);
        compra1.adicionarItem(new Item("Borracha", 5, 1.5));
        compra1.adicionarItem(new Item("Caderno", 10, 18.9));
        compra1.adicionarItem(new Item("Lápis", 2, 1.9));
        System.out.println("Ítens no carrinho: "+ compra1.adicionarItem.size());
        System.out.println("Ítens comprados: \n" + compra1.adicionarItem);
        System.out.println("Valor total da compra: R$" + compra1.getValorTotal());

        //SÓ PRA MOSTRAR A RELAÇÃO BIDIRECIONAL
        double total = compra1.adicionarItem.get(0).compra.adicionarItem.get(1).compra.getValorTotal();
        System.out.println("O valor total da compra, usando Relação bidirecional é: R$" + total);
    }
}
