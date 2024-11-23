package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String conceito = "";
        System.out.println("Digite a nota: ");
        int nota = teclado.nextInt();
        switch (nota) {
            case 10, 9, 8:
                conceito = "A";
                break;
            case 7, 6:
                conceito = "B";
                break;
            case 5, 4:
                conceito = "C";
                break;
            case 3, 2, 1:
                conceito = "D";
                break;
            default:
                conceito = "Informe uma nota válida!";
        }
        System.out.println("Conceito é: " + conceito);
        teclado.close();
    }
}
