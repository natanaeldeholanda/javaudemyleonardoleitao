package operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)

		// Se der certo os 2 trabalhos, a família compra uma televisão de 50 polegadas e
		// compra Sorvete
		// Se der certo os 1 trabalho, a família compra uma televisão de 32 polegadas e
		// compra Sorvete
		// Se nenhum trabalho não der certo, não faz nada
		// Negação lógica em cima do Sorvete
		
		// MINHA RESOLUÇÃO

//		boolean trabalhoTerca = true;
//		boolean trabalhoQuinta = false;
//
//		if (trabalhoTerca && trabalhoQuinta) { // ambos são true
//			System.out.println("Vamos ao shopping tomar Sorvete, pois compramos uma tv de 50");
//		}
//		if (trabalhoTerca || trabalhoQuinta) { // somente um é true
//			System.out.println("Vamos ao shopping comprar uma TV de 32\" e vamos tomar Sorvete ");
//		} else {
//			System.out.println("Vamos ficar em casa, e vamos ficar mais saudáveis");
		
		
		// RESOLUÇÃO DO VÍDEO UDEMY
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = false;
		
		boolean comprouTV50 = trabalhoTerca && trabalhoQuinta;
		boolean comprouTV32 = trabalhoTerca ^ trabalhoQuinta; //
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
		boolean maisSaudavel = !comprouSorvete; // Operador Unário
		
		System.out.println("Comprou TV 50\"? " + comprouTV50 + " " + maisSaudavel);
		System.out.println("Comprou TV 32\"? " + comprouTV32 + " " + maisSaudavel);
		System.out.println("Comprou TV 32\" e tomou Sorvete? " + comprouTV32 + " " + maisSaudavel);
		System.out.println("Mais saudável? " + maisSaudavel);
		}

	}


