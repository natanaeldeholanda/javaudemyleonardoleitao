package classe;

public class Construtor {

	String nome;
	int diaConstrutor;
	int mes;
	int ano;

	Construtor(String nome, int dia, int mes, int ano) {
		this.nome = nome;
		this.diaConstrutor = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String mostrarDadosConstrutor() {
		final String imprimirDadosVariavel = "Me chamo %s, nasci em %d/%d/%d.";
		return String.format(imprimirDadosVariavel, nome, diaConstrutor, mes, ano);
	}

}
