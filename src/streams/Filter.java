package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Rebecca", 9.7);
        Aluno a3 = new Aluno("Eduardo Carmo", 5.6);
        Aluno a4 = new Aluno("Jéssica", 8.8);
        Aluno a5 = new Aluno("Natanael", 8.5);
        Aluno a6 = new Aluno("Darlysson", 6.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5,a6);
        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 6;
        Function<Aluno, String> saudacaoAprovados = aluno -> "Parabéns!!! " + aluno.nome + " você foi aprovado(a)!";
        //Usando o filter pra pegar os alunos que foram aprovados com média maior que 6;
        alunos.stream().filter(aprovado).map(saudacaoAprovados).forEach(System.out::println);
    }
}
