package arrays;

import java.util.Scanner;

/*
 * ESSE DESAFIO CONSISTE EM: 
 * 1) SOLICITAR AO USUÁRIO A QUANTIDADE DE NOTAS
 * 2) ARMAZENAR EM ARRAY
 * 3) USANDO UM FOR, VAI ARMAZENAR AS NOTAS PARA POSTERIORMENTE TAMBÉM COM FOR, FAZER A MÉDIA
 */

public class DesafioArrays {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas: ");
		int quantidadeNotas = entrada.nextInt();

		double[] notasQtde = new double[quantidadeNotas];

		for (int i = 0; i < notasQtde.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notasQtde[i] = entrada.nextDouble();
		}
		double total = 0;

		for (double nota : notasQtde) {
			total += nota;
		}
		double media = total / notasQtde.length;
		System.out.println("A média é: " + media);
		entrada.close();
		
		if (media > 7.0) {
			System.out.println("Aprovado!!!! Parabéns");
		} else {
			System.out.println("Recuperação :/");
		}

	}

}
//System.out.println(Arrays.toString(notasQtde));