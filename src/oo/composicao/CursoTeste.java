package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("Maria");

        Curso curso1 = new Curso("ADS");
        Curso curso2 = new Curso("Psicologia");
        Curso curso3 = new Curso("Direito");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);
        curso3.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno3);

        for (Aluno aluno : curso1.alunos) {
            System.out.println("Alunos matriculados no curso 1: " + curso1 + " " + aluno.nome);
        }
        System.out.println("----------------------");
        for (Aluno aluno : curso2.alunos) {
            System.out.println("Alunos matriculados no curso 2: " + curso2 + " " + aluno.nome);
        }
        System.out.println("----------------------");
        for (Aluno aluno : curso3.alunos) {
            System.out.println("Alunos matriculados no curso 3: " + curso3 + " " + aluno.nome);
        }

        Curso cursoEncontrado = aluno1.obterCursoPorNome("ADS");
        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
