package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosStreams {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Rafael", 6.1);
        Aluno aluno3 = new Aluno("Zuleica", 8.1);
        Aluno aluno4 = new Aluno("Giseuda", 5);
        Aluno aluno5 = new Aluno("Vaninha", 6.1);
        Aluno aluno6 = new Aluno("Geldson", 6.5);
        Aluno aluno7 = new Aluno("Isis", 8.1);
        Aluno aluno8 = new Aluno("Gabriel", 7);
        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8);
//        Consumer<Object> imprimir = System.out::println; -> Metodo para imprimir
        System.out.println("Distinct -> Não pega valores duplicados (necessita equals e hashCode)");
        alunos.stream().distinct().forEach(System.out::println);
        System.out.println("-----------------");
        System.out.println("Skip/Limit -> Paginação dentro do stream");
        alunos.stream().skip(2).limit(4).forEach(System.out::println);
        System.out.println("-----------------");
        System.out.println("takeWhile -> Pega valores de acordo com a lógica");
        alunos.stream().takeWhile(a -> a.nota > 7).forEach(System.out::println);
    }
}
