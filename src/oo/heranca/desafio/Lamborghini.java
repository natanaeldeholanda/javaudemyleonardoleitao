package oo.heranca.desafio;

public class Lamborghini extends Carro {
    Lamborghini() {
        super(300);
    }
    Lamborghini(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    void acelerar() {
        velocidadeAtual += 10;
    }
}
