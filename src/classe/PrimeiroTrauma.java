package classe;

public class PrimeiroTrauma {

	static int a = 3; // Não pode mexer aqui!!!
	int b = 4;

	public static void main(String[] args) {
		
		// Outra forma de resolver o desafio,
		//forma essa que tem que instanciar um novo
		// objeto

		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.b); 

		// pode mexer aqui

		System.out.println(a); // pode mexer aqui

		// pode mexer aqui

		// RESPOSTA -> inserir o static antes de atribuir o valor, foi a forma que
		// resolvi esse desafio
	}

}
