package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTest3 {
    public static void main(String[] args) {
        //Implementando o metodo executar, via lambida;
        BinaryOperator<Double> soma = (x, y)
                -> {
            return x + y;
        };

        BinaryOperator<Double> subtracao = (x, y)
                -> {
            return x - y;
        };
        System.out.println(soma.apply(2.0, 3.0));
        System.out.println(subtracao.apply(3.0, 2.0));
    }
}
