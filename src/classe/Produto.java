package classe;

public class Produto {

	// A Classe, sempre vem antes da instância, ou seja, se colocar static, sempre
	// vir antes

	String nome;
	double preco;
	static double desconto = 0.25;

	Produto() {

	}

	Produto(String nomeInicial, double precoInicial) { // Definindo construtor da forma explícita
		nome = nomeInicial;
		preco = precoInicial;

	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto - descontoGerente);
	}

}
