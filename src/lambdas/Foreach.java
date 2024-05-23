package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Mel");

        System.out.println("Forma Tradicional Foreach");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }
        System.out.println("----------------");
        System.out.println("Lambda versão 1");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));
        System.out.println("----------------");
        System.out.println("Method Reference 1: ");
        aprovados.forEach(System.out::println);
        System.out.println("----------------");
        System.out.println("Lambda versão 2");
        aprovados.forEach(nome -> meuImprimir(nome));
        System.out.println("----------------");
        System.out.println("Method Reference 2: ");
        aprovados.forEach(Foreach::meuImprimir);

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi, meu nome é " + nome);
    }
}
