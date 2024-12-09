package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinarioBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        if (media.apply(9.8, 5.7) >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado.apply(9.7, 4.1));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
        String resultadoFinal = media.andThen(conceito).apply(9.7, 5.1);
        System.out.println(resultadoFinal);

    }
}
//Forma de vericação se a pessoa tirou a média para ser aprovado ou não;