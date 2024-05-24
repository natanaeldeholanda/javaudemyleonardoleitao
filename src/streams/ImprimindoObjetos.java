package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu", "Gui", "Ana", "Mel");
        System.out.println("Usando o foreach: ");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }
        System.out.println("\nUsando Iterator: ");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nUsando Stream: ");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); //Laço interno;
    }
}

