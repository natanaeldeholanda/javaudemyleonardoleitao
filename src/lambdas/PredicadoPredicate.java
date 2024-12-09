package lambdas;

import java.util.function.Predicate;

public class PredicadoPredicate {
    public static void main(String[] args) {
      Predicate<Produto> isCaro = produto -> produto.preco * (1 - produto.desconto) >= 750;
        Produto notebook = new Produto("Notebook", 3899.89, 0.15);
        System.out.println(isCaro.test(notebook));
    }
}
