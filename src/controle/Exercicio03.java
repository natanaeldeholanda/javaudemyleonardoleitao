package controle;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("---***--- Programa de Média Escolar ---***---");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
        if(media >= 7.0){
            System.out.println("Aprovado!");
        } else if(media >= 6.9 || media >= 4.0){
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
        teclado.close();
    }
}
