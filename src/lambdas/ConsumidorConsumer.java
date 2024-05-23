package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumidorConsumer {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto p1 = new Produto("Caneta", 12.34, 0.09);

        imprimir.accept(p1);
        System.out.println("---------------");
        Produto p2 = new Produto("Lápis", 2.34, 0.05);
        Produto p3 = new Produto("Caderno", 11.39, 0.07);
        Produto p4 = new Produto("Borracha", 9.34, 0.3);
        Produto p5 = new Produto("Colecionardor", 12.39, 0.09);

        List<Produto> produto = Arrays.asList(p1, p2, p3, p4, p5);
        produto.forEach(imprimir);
        System.out.println("---------------");
        produto.forEach(p -> System.out.println(p.preco));
        System.out.println("---------------");
        produto.forEach(System.out::println);

    }
}
