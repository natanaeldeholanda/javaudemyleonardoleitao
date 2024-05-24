package lambdas;

import java.util.function.Predicate;

public class PredicadoPredicateComposicao {
    public static void main(String[] args) {
      Predicate<Integer> isPar = num -> num % 2 == 0;
      Predicate<Integer> isTresDigitos = numTres -> numTres >= 100 && numTres <= 999;
      System.out.println("É par, ou tem três dígitos: "+ isPar.or(isTresDigitos).and(isTresDigitos).test(15));
      System.out.println("Tem três dígitos? "+ isTresDigitos.negate().test(100));
    }
}
