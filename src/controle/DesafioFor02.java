package controle;

public class DesafioFor02 {
    public static void main(String[] args) {
        String valor = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }
        System.out.println("Resolução Desafio");
        //Versão do desafio
        //Não pode usar valor numérico para controlar o laço.

        //RESPOSTA DESAFIO
        for (String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
