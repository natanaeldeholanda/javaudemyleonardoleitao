package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReduceTeste2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Rafael", 5.5);
        Aluno aluno3 = new Aluno("Zuleica", 8.9);
        Aluno aluno4 = new Aluno("Giseuda", 10);
        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

        Predicate<Aluno> aprovado = a -> a.nota >= 6;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> somatoria = (a, b) -> a + b;

        alunos.stream().filter(aprovado).map(apenasNota).reduce(somatoria).ifPresent(System.out::println);
    }
}
