package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc area = new AreaCirc(10);
		//	System.out.println(area.mostrarDados());
		
		System.out.println(area.areaPi()); // Chamando o método areaPi
		System.out.println(AreaCirc.area(100)); // Chamando o método area
		System.out.println(AreaCirc.PI); // Cálculo do PI do valor atribuido em AreaCirc
		System.out.println(Math.PI); // Cálculo do PI exibido pelo próprio java
		
	
	}

}
