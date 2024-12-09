package lambdas;

import java.util.function.Function;

public class FuncaoFunction {
    public static void main(String[] args) {
        //A saída do metodo, tem que ser a entrada do outro metodo;
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
        System.out.println(parOuImpar.apply(32));
        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
        Function<String, String> empolgado = valor -> valor + "!!!";
        String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(32);
        String resultadoEmpolgado = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
        System.out.println(resultadoFinal);
        System.out.println(resultadoEmpolgado);
    }
}