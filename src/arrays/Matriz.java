package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		System.out.print("Quantas notas? ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		
		double total = 0;
		for (int alunos = 0; alunos < notasDaTurma.length; alunos++) {
			for (int notas = 0; notas < notasDaTurma[alunos].length; notas++) {
				System.out.printf("Informe a nota %d do aluno %d: ", notas + 1, alunos + 1);	
				notasDaTurma[alunos][notas] = entrada.nextDouble();
				total += notasDaTurma[alunos][notas];
			}
		
		}
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma: " + media);
		entrada.close();
	}

}
