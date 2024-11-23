package controle;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número que direi se é par ou impar: ");
        int numeroDigitado = teclado.nextInt();
        if (numeroDigitado % 2 == 0){
            System.out.println("O número " + numeroDigitado + " é par.");
        } else {
            System.out.println("O número " + numeroDigitado + " é ímpar.");
        }
        teclado.close();
    }
}
