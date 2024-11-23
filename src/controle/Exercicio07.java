package controle;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto para ler a entrada do usuário
        int soma = 0; // Inicializa a variável que armazenará a soma dos números

        System.out.println("Digite números positivos para somar. Digite um número negativo para encerrar.");

        while (true) { // Loop infinito que será encerrado ao receber um número negativo
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt(); // Lê o número inserido pelo usuário

            if (numero < 0) { // Verifica se o número é negativo
                System.out.println("Número negativo detectado. Programa encerrado.");
                break; // Encerra o loop
            }

            soma += numero; // Adiciona o número à soma
            System.out.println("Soma atual: " + soma); // Exibe a soma atual no console
        }

        scanner.close(); // Fecha o objeto Scanner
    }
}
