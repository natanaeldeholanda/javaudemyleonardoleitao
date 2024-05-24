package streams;

import java.util.Arrays;
import java.util.List;

/*
1. Número pra String binária... 6 => "110";
2. Inverter a String "110" => "011";
3. Converter de volta pra inteiro => 3;
 */

public class DesafioMapVersao2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Passo 1: Converter para String binária");
        nums.stream()
                .map(Integer::toBinaryString)
                .forEach(System.out::println);
        System.out.println("--------------------------");
        System.out.println("Passo 2: Inverter a String binária");

        nums.stream()
                .map(Integer::toBinaryString)
                .map(s -> new StringBuilder(s).reverse().toString())
                .forEach(System.out::println);
        System.out.println("--------------------------");
        System.out.println("Passo 3: Converter de volta para inteiro");

        // Passo 3: Converter de volta para inteiro
        nums.stream()
                .map(Integer::toBinaryString)
                .map(s -> new StringBuilder(s).reverse().toString())
                .map(s -> Integer.parseInt(s, 2))
                .forEach(System.out::println);
        /*
        Neste código, usamos a função Integer.toBinaryString para converter os números inteiros para suas
        representações binárias em formato de String. Em seguida, invertemos a String binária e a convertemos de volta
        para um número inteiro usando Integer.parseInt.
         */

    }
}
