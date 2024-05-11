package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data(); // Chamando construtor padrão
				
		Data data2 = new Data(31, 12, 2020); // Construtor que recebe dia, mes, e ano direto no construtor
		
		System.out.println(data1.mostrarData());
		System.out.println(data2.mostrarData());
		
		Construtor teste = new Construtor("Natanael", 14, 12, 1986);
		
		System.out.println(teste.mostrarDadosConstrutor());
		
			
	}

}
