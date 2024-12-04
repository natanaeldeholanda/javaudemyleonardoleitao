package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays2 {
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de notas: ");
        Scanner teclado = new Scanner(System.in);
        int quantidadeNotas = teclado.nextInt();
        double[] notas = new double[quantidadeNotas];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println("Média: " + media / notas.length);
    }
}
