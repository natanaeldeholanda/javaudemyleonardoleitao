package controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera um número aleatório entre 0 e 100
        int numeroAleatorio = random.nextInt(101); // Limite superior é exclusivo, então usamos 101
        int tentativasRestantes = 10;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo da Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100. Você tem 10 tentativas.");

        // Loop para as tentativas
        while (tentativasRestantes > 0) {
            System.out.print("\nDigite sua tentativa: ");
            int palpite = scanner.nextInt();
            tentativasRestantes--;

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + "!");
                acertou = true;
                break;
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número inserido é maior que o número armazenado.");
            } else {
                System.out.println("O número inserido é menor que o número armazenado.");
            }

            // Exibe as tentativas restantes
            if (tentativasRestantes > 0) {
                System.out.println("Você ainda tem " + tentativasRestantes + " tentativa(s).");
            } else {
                System.out.println("Suas tentativas acabaram! O número era " + numeroAleatorio + ".");
            }
        }

        if (!acertou) {
            System.out.println("\nFim de jogo! Boa sorte na próxima vez.");
        }

        scanner.close();
    }
}
