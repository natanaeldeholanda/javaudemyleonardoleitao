package operadores;

import java.util.Scanner;

public class DesafioModulo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite 2 números: ");
		double num1 = teclado.nextDouble();
		double num2 = teclado.nextDouble();
		
		System.out.println("Informe uma operação: ");
		String operacao = teclado.next();
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("O Resultado é: %.2f %s %.2f = %.2f ", num1, operacao, num2, resultado);
		
		teclado.close();
	}

}
