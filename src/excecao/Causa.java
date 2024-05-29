package excecao;

public class Causa {
    public static void main(String[] args) {
        //Tratando a exceção para mostrar a causa do erro, onde uma exceção é a causa de outra exceção!
        try {
            metodoA(null);
        } catch (Exception e) {
            if (e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }
        metodoA(null);
    }

    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (Exception causa) {
            throw new IllegalArgumentException(causa);
        }
    }

    static void metodoB(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("Aluno está NULO!!!");
        }
        System.out.println(aluno.nome);
    }
}
