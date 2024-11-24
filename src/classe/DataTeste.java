package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data(1, 6, 2022);
		d1.dia = 31;
		d1.mes = 12;
		d1.ano = 2021;
		String dataFormatada = d1.mostrarDataFormatada();
		System.out.println(dataFormatada);
	}

}
