package arrays;

public class Foreach {

	public static void main(String[] args) {

		double[] notas = { 9.9, 8.7, 7.2, 9.4 };
		
		//PERCORRENDO ARRAYS COM O FOR "PADRÃO"		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " | ");
		}
		
		System.out.println();
		//PERCORRENDO ARRAYS, USANDO O FOREACH
		for (double nota : notas) {
			System.out.print(nota + " | ");
			
		}
		
	}

}
