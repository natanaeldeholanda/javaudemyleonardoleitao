package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumidorConsumer {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = produto -> System.out.println(produto.nome);
        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        Produto p2 = new Produto("Lápis", 2.34, 0.07);
        Produto p3 = new Produto("Notebook", 2112.99, 0.10);
        Produto p4 = new Produto("Pneus", 259.90, 0.08);
        Produto p5 = new Produto("Smartphone", 1999.90, 0.05);
        imprimir.accept(p1);
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimir);
        System.out.println("---***---");
        produtos.forEach(p -> System.out.println(p.preco));
        System.out.println("---***---");
        produtos.forEach(System.out::println);
    }
}
