package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o dia da semana: ");

		String diaSemana = entrada.nextLine();

		if (diaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		} else if (diaSemana.equalsIgnoreCase("Segunda") || diaSemana.equalsIgnoreCase("Seg")) {
			System.out.println("2");
		} else if (diaSemana.equalsIgnoreCase("Terça") || diaSemana.equalsIgnoreCase("Ter")) {
			System.out.println("3");
		} else if (diaSemana.equalsIgnoreCase("Quarta") || diaSemana.equalsIgnoreCase("Qua")) {
			System.out.println("4");
		} else if (diaSemana.equalsIgnoreCase("Quinta") || diaSemana.equalsIgnoreCase("Qui")) {
			System.out.println("5");
		} else if (diaSemana.equalsIgnoreCase("Sexta") || diaSemana.equalsIgnoreCase("Sex")) {
			System.out.println("6");
		} else if (diaSemana.equalsIgnoreCase("Sábado") || diaSemana.equalsIgnoreCase("Sab")) {
			System.out.println("7");
		} else {
			System.out.println("Digite um dia válido!");

			entrada.close();

		}
	}

}
