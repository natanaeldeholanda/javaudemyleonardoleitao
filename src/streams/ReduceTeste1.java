package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceTeste1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;
        Integer total1 = numeros.stream().reduce(soma).get();
        System.out.println(total1);
        Integer total2 = numeros.stream().reduce(100, soma);
        System.out.println(total2);

        //O resultado foi um Opticonal<Integer>
        numeros.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);
    }
}
