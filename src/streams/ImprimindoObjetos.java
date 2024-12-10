package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        System.out.println("Usando o método forEach...");
        for (String nome : aprovados) {
            System.out.printf(" | " + nome + " | ");
        }
        System.out.println("\n\n Usando Iterator...");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()){
            System.out.printf(" | " + iterator.next() + " | " );
        }
        System.out.println("\n\n Usando Stream...");
        Stream<String> stream = aprovados.stream();
//        stream.forEach(nome -> System.out.printf(" | " + nome + " | ")); // Para imprimir na mesma linha, formatado
        stream.forEach(System.out::println); // Para imprimir cada elemento em uma linha, ou seja, laço interno
    }
}

