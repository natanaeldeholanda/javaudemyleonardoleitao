package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinarioBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8, 5.7));

        //Forma de vericação se a pessoa tirou a média para ser aprovado ou não;
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = ((n1 + n2) / 2);
            return notaFinal >= 6 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado.apply(7.5, 6.5));
        Function<Double, String> conceito = m -> m >= 6 ? "Aprovado" : "Reprovado";
        System.out.println("-----------");
        System.out.println(media.andThen(conceito).apply(9.7, 4.1));
    }
}
