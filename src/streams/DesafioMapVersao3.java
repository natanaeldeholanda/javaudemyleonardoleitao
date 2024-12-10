package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
1. Número pra String binária... 6 => "110";
2. Inverter a String "110" => "011";
3. Converter de volta pra inteiro => 3;
 */

public class DesafioMapVersao3 {
    public static void main(String[] args) {
        Consumer<String> imprimir = System.out::println;
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> binarioParaInteiro = s -> Integer.parseInt(s, 2);


        System.out.println("Passo 1: Converter uma String Binária: ");
        nums.stream().map(Integer::toBinaryString).forEach(imprimir);
        System.out.println("Passo 2: Invertendo a String Binária: ");
        nums.stream().map(Integer::toBinaryString).map(s -> new StringBuilder(s).reverse().toString()).forEach(imprimir);
        System.out.println("Passo 3: Convertendo de volta para inteiro: ");
        nums.stream().map(Integer::toBinaryString).map(s -> new StringBuilder(s).reverse().toString()).map(s -> Integer.parseInt(s, 2)).forEach(System.out::println);

        System.out.println("---***--- Bônus ---***---");
        System.out.println("Converter uma String Binária: ");
        nums.stream().map(Integer::toBinaryString).forEach(System.out::println);
        System.out.println("Invertendo a String Binária: ");
        nums.stream().map(Integer::toBinaryString).map(inverter).forEach(System.out::println);
        System.out.println("Convertendo de volta para inteiro: ");
        nums.stream().map(Integer::toBinaryString).map(inverter).map(binarioParaInteiro).forEach(System.out::println);
        /*
        Neste código, usamos a função Integer.toBinaryString para converter os números inteiros para suas
        representações binárias em formato de String. Em seguida, invertemos a String binária e a convertemos de volta
        para um número inteiro usando Integer.parseInt.
         */

    }
}
