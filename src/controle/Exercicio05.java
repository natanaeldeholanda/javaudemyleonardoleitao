package controle;

import java.util.Scanner;

import static controle.Exercicio04.ehPrimo;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica números específicos com switch-case
        switch (numero) {
            case 1:
                System.out.println("O número 1 não é primo.");
                break;
            case 2:
            case 3:
                System.out.println("O número " + numero + " é primo.");
                break;
            default:
                // Para números maiores que 3, utiliza o método de verificação
                if (ehPrimo(numero)) {
                    System.out.println("O número " + numero + " é primo.");
                } else {
                    System.out.println("O número " + numero + " não é primo.");
                }
        }

        scanner.close();
    }

    // Método para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        // Verifica divisores de 2 até a raiz quadrada do número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se for divisível por 'i', não é primo
            }
        }

        return true; // Se não encontrou divisores, o número é primo
    }
}

