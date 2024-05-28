package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Rafael", 6.1);
        Aluno aluno3 = new Aluno("Zuleica", 8.1);
        Aluno aluno4 = new Aluno("Giseuda", 5);
        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

        Predicate<Aluno> aprovado = a -> a.nota >= 6;
        Predicate<Aluno> reprovado = aprovado.negate();

        System.out.println("Todos foram aprovados? " + alunos.stream().allMatch(aprovado)); //Retorna se todas as instâncias foram aprovadas;
        System.out.println("Pelo menos um foi aprovados? " + alunos.stream().anyMatch(aprovado)); //Retorna se pelo menos uma instância foi aprovada;
        System.out.println("Todos foram aprovados? " + alunos.stream().noneMatch(reprovado)); //Retorna se nenhum foi aprovado;
    }
}
