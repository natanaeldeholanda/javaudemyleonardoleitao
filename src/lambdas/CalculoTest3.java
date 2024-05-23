package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTest3 {
    public static void main(String[] args) {
        //Implementando o método executar, via lambida;

        BinaryOperator<Double> somar = (a, b) -> {
            return a + b;
        };
        System.out.println("Chamando a adição: " + somar.apply(4.0, 5.0));
        BinaryOperator<Double> multiplicar = (a, b) -> {
            return a * b;
        };
        System.out.println("Chamando a multiplicação: " + multiplicar.apply(4.0, 5.0));
    }
}
