package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a média: ");
		double nota = entrada.nextDouble();

		if (nota <= 10 && nota >= 7.0) {
			System.out.println("Aluno Aprovado!");
			System.out.println("Parabéns!");
		}
		if (nota < 7.0 && nota >= 4.5) {
			System.out.println("Aluno em recuperação!");
			System.out.println("Estude mais!");
		}
		if (nota < 4.4 && nota >= 0) { // Quando usa muitos IF, sugestão de incluir variáveis
			System.out.println("Aluno Reprovado!");
		}

		entrada.close();

	}

}
