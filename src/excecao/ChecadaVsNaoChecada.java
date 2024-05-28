package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        geraErro1();
        geraErro2();
        System.out.println("Fim do programa");
    }
        //Não basta estanciar o erro, tem que chamar através do throw!!!
    static void geraErro1() {
       throw new RuntimeException("Ocorreu o Erro 1");
    }

    static void geraErro2() {
        new Exception("Ocorreu o Erro 2");
    }
}
