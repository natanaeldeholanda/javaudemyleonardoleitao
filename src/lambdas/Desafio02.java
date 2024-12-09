package lambdas;

/*
1. A partir do produto, calcular o preço real(com desconto);
2. Imposto municipal: >= 2500 (8,5%) / < 2500 (Isento);
3. Frete: >= 3000 (100) / < 300 (50);
4. Arredondar: deixar 2 casas decimais;
5. Formatar: R$ 1234,56
 */

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio02 {
    public static void main(String[] args) {
        Produto produtoFinal = new Produto("iPad", 2499.89, 0.13);
        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto); //1.
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco; //2.
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50; //3.
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", ".")); //4.
        Function<Double, String> formatar = preco -> ("R$ " + preco).replace(".", ","); //5.
        String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(produtoFinal);
        System.out.println("O preço final: " + preco);
    }
}
