package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor valor (Tipo Primitivo)
		
		a++;
		b--;
		System.out.println(a + " | " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atibuição por referência (Objeto)
		
		d1.dia = 31;
		d1.mes = 12;
		
		System.out.println(d1.mostrarData());
		System.out.println(d2.mostrarData());
		
	}

}
