package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	// Desafio Construtor -> Criando o construtor padrão
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	Data(int dia, int mes, int ano) { // Construtor que recebe os três parametros, usando this pra referenciar o objeto atual,
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// Criação do método mostrar data. Todo método é representado por (){
	// } -> EX: mostrarMetodo(){
	// Local onde é inserido os parâmetros.
//}
	String mostrarData() {
		return String.format("%d/%d/%d", dia, mes, ano);
		// Esse é o método que tem que ser usado em uma aplicação desktop!
	}

}
