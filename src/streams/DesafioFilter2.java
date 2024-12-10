package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Lavadora de roupas", 899.99, 0.07, 99.90);
        Produto p2 = new Produto("Guarda roupas", 699.99, 0.09, 99.90);
        Produto p3 = new Produto("Fogão", 899.99, 0.07, 99.90);
        Produto p4 = new Produto("Geladeira", 999.99, 0.05, 109.90);
        Produto p5 = new Produto("Mesa de jantar", 599.99, 0.10, 99.90);
        Produto p6 = new Produto("Sofá 3 lugares", 1099.99, 0.15, 49.90);
        Produto p7 = new Produto("Ar condicionado", 2199.90, 0.05, 69.90);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
        Predicate<Produto> grandeDesconto = p-> p.desconto >= 0.04;
        Predicate<Produto> freteGratis = p-> p.valorFrete >= 50;
        Predicate<Produto> precoRelevante = p-> p.preco >= 499.90;
        Function<Produto, String> chamadaPromocional = produto ->  "Aproveite!!! " + produto.nome + " por R$" + produto.preco;

        produtos.stream().filter(grandeDesconto).filter(freteGratis).filter(precoRelevante).map(chamadaPromocional).forEach(System.out::println);
    }
}
