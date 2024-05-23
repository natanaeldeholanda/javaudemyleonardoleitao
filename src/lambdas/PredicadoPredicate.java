package lambdas;

import java.util.function.Predicate;

public class PredicadoPredicate {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = produto -> (produto.preco * (1 - produto.desconto)) >= 750;
        Produto produto = new Produto("Notebook", 2399.00, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
