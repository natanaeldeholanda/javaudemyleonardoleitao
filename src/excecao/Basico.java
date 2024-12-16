package excecao;

public class Basico {

    public static void main(String[] args) {
        Aluno a1 = null;
        try {
            imprimirAluno(a1);
        } catch (Exception e) {
            System.out.println("Erro ao imprimir aluno");
        }
        //Tratando o erro, retornando a mensagem através do sout e e.getMessage());
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException exception) {
            System.out.println("Ocorreu o erro: " + exception.getMessage());
        }
        System.out.println("Fim do programa");
    }

    public static void imprimirAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}