package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8, true);
        Aluno a2 = new Aluno("Rebecca", 7.7, false);
        Aluno a3 = new Aluno("Eduardo Carmo", 7.6, false);
        Aluno a4 = new Aluno("Jéssica", 9.8, true);
        Aluno a5 = new Aluno("Natanael", 9.8, true);
        Aluno a6 = new Aluno("Darlysson", 6.8, false);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        Predicate<Aluno> estaAprovado = a -> a.nota >= 7 && a.bomComportamento;
        Predicate<Aluno> temBomComportamento = a -> a.bomComportamento;
        Function<Aluno, String> saldacao = a -> "Parabéns " + a.nome + "! Você foi aprovado(a) com nota " + a.nota + " e teve bom comportamento!!!";
        alunos.stream()
                .filter(estaAprovado)
                .filter(temBomComportamento)
                .map(saldacao)
                .forEach(System.out::println);
    }
}
