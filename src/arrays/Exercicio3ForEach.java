package arrays;

public class Exercicio3ForEach {

	public static void main(String[] args) {

		double[] notas = { 9.3, 7.8, 6.5, 7.5 };

		for (double mediaFinal : notas) {
			System.out.println("As notas do Aluno A foram: " + mediaFinal);

		}
		
		double[] notasB = new double [4];
		notasB[0] = 5.5;
		notasB[1] = 7.5;
		notasB[2] = 9.7;
		notasB[3] = 8.1;
		
		System.out.println("------------------------------");
		
		for(double mediaFinalB : notasB) {
			System.out.println("As notas do Aluno B foram: " + mediaFinalB);
		}
		

	}

}
