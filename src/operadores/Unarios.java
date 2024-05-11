package operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1 // pós fixada, onde o operador antes do operando
		a--; // a = a - 1
		System.out.println(a);
	//	++b; // b = b + 1
		System.out.println(b);
		System.out.println("Mini desafio -> true or false?");
		System.out.println(++a == b--);
		System.out.println(a);
		System.out.println(b);

	}

}
