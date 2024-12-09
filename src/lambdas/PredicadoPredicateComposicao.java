package lambdas;

import java.util.function.Predicate;

public class PredicadoPredicateComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
        System.out.println(isPar.test(23));
        System.out.println(isTresDigitos.test(23));
        System.out.println(isPar.and(isTresDigitos).test(124));
        System.out.println(isPar.or(isTresDigitos).test(123));
    }
}
