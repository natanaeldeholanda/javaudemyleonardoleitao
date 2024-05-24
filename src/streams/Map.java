package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        List<String> marcas = Arrays.asList("BMW ", "Honda ", "Citröen ", "Audi \n");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);
        //UnaryOperator<String> maiuscula = n -> n.toUpperCase(); // Criado uma classe de utilitários e chamando lambda via classe;
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        //UnaryOperator<String> grito = n -> n + "!!!!!!  "; // Criado um método em Utilitários e chamando method reference;
        System.out.println("\nUsando composição");
        marcas.stream().map(Utilitarios.maiuscula).map(primeiraLetra).map(Utilitarios::grito).forEach(print);



    }
}
