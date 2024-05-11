package operadores;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {

		// SEMPRE COMPARAR STRINGS SOMENTE USAR O EQUALS

		System.out.println("2" == "2");

		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); // equals compara os conteúdos

		Scanner entrada = new Scanner(System.in);

		String s2 = entrada.next(); // next tira o espacos em branco, porém o nextLine não tira os espaços em branco
		System.out.println("2" == s2.trim()); // .trim tira os espaços em brancos
		System.out.println("2".equals(s2.trim())); // .trim tira os espaços em brancos

		entrada.close();
	}

}
