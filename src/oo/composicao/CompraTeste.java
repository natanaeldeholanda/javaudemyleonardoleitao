package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "Natanael";
        compra1.adicionarItem("Caneta", 3, 2.5);
        compra1.adicionarItem("Borracha", 5, 1.5);
        compra1.adicionarItem(new Item("Caderno", 10, 18.9)); //Outra forma de instanciar um item
        compra1.adicionarItem(new Item("Lápis", 2, 1.9));
        System.out.println("Ítens no carrinho: "+ compra1.itens.size());
        System.out.println("Ítens comprados-> " + compra1.itens);
        System.out.printf("Valor total da compra: R$ %.2f\n", compra1.getValorTotal());

        //SÓ PRA MOSTRAR A RELAÇÃO BIDIRECIONAL
        double total = compra1.itens.getFirst().compra.itens.get(1).compra.getValorTotal();
        System.out.printf("O valor total da compra, usando Relação bidirecional é: R$ %.2f", total);
    }
}
