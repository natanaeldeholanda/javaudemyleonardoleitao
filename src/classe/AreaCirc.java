package classe;

public class AreaCirc {

    double raio;
    static final double PI = 3.14; // quando declara final, tem que colocar a variável em MAIÚSCULO.

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

//	String mostrarDados() {
//		return String.format("Os dados fornecidos foram: %.2f e %.2f", raio, pi);
//	}

    double areaPi() {
        return PI * Math.pow(raio, 2);
    }

    //METODO ESTÁTICO
    double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
	

