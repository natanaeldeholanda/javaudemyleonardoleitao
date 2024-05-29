package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args){
        try {
            geraErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Fim do programa");
    }

    //Não basta estanciar o erro, tem que chamar através do throw!!!
    // Não checada ou não verifica
    static void geraErro1() {
        throw new RuntimeException("Ocorreu o Erro 1");
    }

    // Exceção checada ou verificada
    static void geraErro2() throws Exception {
        try {
            throw new Exception("Ocorreu o Erro 2");
        } catch (Exception e) {
            System.out.println("Excecao geraErro2");
        }
    }
}
