package lambdas;

import java.util.function.Function;

public class FuncaoFunction02 {
    public static void main(String[] args) {
        //A saída do metodo, tem que ser a entrada do outro metodo;
        // Função que converte uma string para maiúsculas
        Function<String, String> paraMaiusculas = String::toUpperCase;

        // Função que adiciona um ponto de exclamação ao final da string
        Function<String, String> adicionarExclamacao = s -> s + "!!!";

        // Combinando as duas funções
        Function<String, String> resultadoFinal = paraMaiusculas.andThen(adicionarExclamacao);

        // Testando a função combinada
        String resultado = resultadoFinal.apply("olá mundo, estou aprendendo funções lambdas");
        System.out.println(resultado); // Imprime "OLÁ MUNDO, ESTOU APRENDENDO FUNÇÕES LAMBDAS!"
    }
}