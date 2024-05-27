package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceTeste1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;
        //Reduce é uma função que termina, ou seja não pode usar um map ou outra função;
        Integer total = nums.stream().reduce(soma).get();
        System.out.println(total);

        //Resultado foi um Optional<Integer>;
        nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);
    }
}
