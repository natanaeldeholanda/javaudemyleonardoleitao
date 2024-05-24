package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/*REQUISITOS DESAFIO:
  1. A partir do produto, calcular o preço real(com desconto);
  2. Imposto municipal: >= 2500 (8,5%) / < 2500 (Isento);
  3. Frete: >= 3000 (100) / < 300 (50);
  4. Arredondar: deixar 2 casas decimais;
  5. Formatar: R$
   */
public class Desafio {
    public static void main(String[] args) {
        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Math.round(preco * 100.0) / 100.0;
        Function<Double, String> formatar = preco -> String.format("R$%.2f", preco).replace(".", ",");

        Produto p = new Produto("iPad", 3235.89, 0.13);
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preço final: " + preco);

    }

}
