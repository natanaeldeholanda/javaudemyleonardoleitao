package controle;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Objeto para ler a entrada do usuário
        int maior = Integer.MIN_VALUE; // Inicializa a variável com o menor valor possível de um inteiro

        System.out.println("Digite 10 números:");

        for (int i = 1; i <= 10; i++) { // Loop que itera exatamente 10 vezes
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt(); // Lê o número inserido pelo usuário

            if (numero > maior) { // Verifica se o número atual é maior que o maior número encontrado até agora
                maior = numero; // Atualiza a variável 'maior' com o novo maior número
            }
        }

        System.out.println("O maior número digitado foi: " + maior); // Exibe o maior número
        scanner.close(); // Fecha o objeto Scanner
    }
}

