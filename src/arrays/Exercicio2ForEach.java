package arrays;

public class Exercicio2ForEach {

	public static void main(String[] args) {
		/* Array é acessado a partir de um determinado índice;
		 * Tem tamanho fixo;
		 * Tem estrutura homogênea;
		 */
		
		// Declarando array
		
//		double[] notasAlunoA = new double [3];
		
		// adicionando as notas no array:
		
//		notasAlunoA[0] = 7.9;
//		notasAlunoA[1] = 8.0;
//		notasAlunoA[2] = 9.5;
//		
//		System.out.println(Arrays.toString(notasAlunoA)); // Imprimindo arrays, dessa forma sai a quantidade atribuida.
//		
//		//percorrendo array, com a notação ponto length
//		double totalAlunoA = 0;
//		for(int i = 0; i < notasAlunoA.length; i++) {
//			totalAlunoA += notasAlunoA[i];
//			
//		}
//		System.out.println("A média do aluno A é: " + totalAlunoA/notasAlunoA.length);
		
		// Outra forma de declarar array, inicializando as notas diretamente, porém é menos usado.
		double [] notasAlunoB = { 6.9, 8.9, 5.5, 10 }; 
		for (double notaForEach : notasAlunoB) { // Declara uma variável e coloca : com o Array
			System.out.println(notaForEach);
		}
		//System.out.println("A média do aluno B é: " +totalAlunoB/notasAlunoB.length);
	}

}
