package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		Comida arroz = new Comida ("Arroz", 0.233);
		
		Comida feijao = new Comida ("Feijão", 0.300);
		
		Comida carne = new Comida ("Carne", 0.320);
		
		Pessoa pessoa = new Pessoa ("João", 122.7);
		
		System.out.println(pessoa.apresentar() + ", vou comer algo.");
		pessoa.comer(feijao);
		System.out.println(pessoa.apresentar() + ", após comer feijão.");
		pessoa.comer(arroz);
		System.out.println(pessoa.apresentar() + ", após comer arroz.");
		pessoa.comer(carne);
		System.out.println(pessoa.apresentar() + ", após comer carne.");
		
	}

}
