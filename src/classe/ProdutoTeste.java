package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4356.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome + " -> R$" + p1.precoComDesconto());
		System.out.println(p2.nome + " -> R$" + p2.precoComDesconto());

		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double medicaCarrinho = (precoFinal1 + precoFinal2) / 2;
		double medicaCarrinhoDescontoGerente = (precoFinal1 + precoFinal2) / 2;

		
		System.out.printf( "Média do carrinho = R$%.2f\n", medicaCarrinho);
		System.out.printf("Preço do Notebook com o desconto do Gerente -> R$%.2f", p1.precoComDesconto(0.15));
	}

}
