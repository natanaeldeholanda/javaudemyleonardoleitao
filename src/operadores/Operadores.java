package operadores;

public class Operadores {

	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // operador e
		System.out.println(condicao1 || condicao2); // operador ou
		System.out.println(condicao1 ^ condicao2); // operador ou exclusivo
		System.out.println(!condicao1); // negação lógica
		
		System.out.println("\nTABELA VERDADE E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		System.out.println("\nTABELA VERDADE OU (OR)");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTABELA VERDADE OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTABELA VERDADE NEGAÇÃO (NOT)");
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
