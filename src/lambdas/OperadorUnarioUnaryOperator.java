package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnarioUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperatorMaisDois = x -> x + 2;
        UnaryOperator<Integer> unaryOperatorVezesDois = x -> x * 2;
        UnaryOperator<Integer> unaryOperatorAoQuadrado = x -> x * x;
        //.compose: executa na ordem do .andThen;
        int resultado = unaryOperatorAoQuadrado.andThen(unaryOperatorVezesDois.andThen(unaryOperatorMaisDois)).apply(5);
        System.out.println(resultado);
        //.compose: execulta de trás pra frente;
        int resultado2 = unaryOperatorAoQuadrado.compose(unaryOperatorVezesDois).compose(unaryOperatorMaisDois).apply(5);
        System.out.println(resultado2);
    }
}
