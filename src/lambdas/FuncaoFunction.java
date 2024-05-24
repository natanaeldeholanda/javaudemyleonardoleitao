package lambdas;

import java.util.function.Function;

public class FuncaoFunction {
    public static void main(String[] args) {
        //A saída do método, tem que ser a entrada do outro método;
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
        System.out.println(parOuImpar.apply(5));
        System.out.println("-------------");
        Function<String, String> resultadoE = valor -> "Resultado é: " + valor;
        Function<String, String> empolgado = valor -> valor + "!!!!";
        Function<String, String> aprendendo = valor -> valor + " \nÉ show!!!";
        Function<String, String> sextou = valor -> valor + " \nHoje é sexta feira!!!!";
        String resultado = parOuImpar.andThen(resultadoE).andThen(empolgado).andThen(aprendendo).andThen(sextou).apply(3);
        System.out.println(resultado);
        System.out.println("-------------");

    }
}