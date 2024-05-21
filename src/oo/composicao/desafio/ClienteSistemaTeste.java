package oo.composicao.desafio;

public class ClienteSistemaTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria Joaquina");
        Compra compra1 = new Compra();
        compra1.adicionarItem2("Caneta", 9.67, 10);
        compra1.adicionarItem(new Produto("Notebook", 1999.88), 2);
        Compra compra2 = new Compra();
        compra2.adicionarItem(new Produto("Apontador", 3.99), 1);
        compra2.adicionarItem2("Lápis", 5.69, 5);

        cliente1.adicionarCompra(compra1);
        cliente1.adicionarCompra(compra2);

        //Adicionei os métodos .concat e .toString pra trazer o nome do cliente, os produtos comprados e o valor total
        System.out.println(cliente1.nome.concat(cliente1.compras.toString()) + "\n" + "Valor Total: R$" + cliente1.obterValorTotalCliente());

    }
}
