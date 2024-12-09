package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnarioUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = numero -> numero + 2;
        UnaryOperator<Integer> vezesDois = numero -> numero * 2;
        UnaryOperator<Integer> aoQuadrado = numero -> numero * numero;
        int resultado = maisDois.andThen(vezesDois.andThen(aoQuadrado)).apply(0); // 0 + 2 = 2 * 2 = 4 * 4 = 16
        System.out.println(resultado);
        int resultado2 = aoQuadrado.compose(vezesDois.compose(maisDois)).apply(0); // 0 + 2 = 2 * 2 = 4 * 4 = 16
        System.out.println(resultado2);
    }
}
