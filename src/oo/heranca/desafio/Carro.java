package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int boost = 10;

    Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "velocidadeAtual=" + VELOCIDADE_MAXIMA +
                '}';
    }

    void acelerar() {
        if (velocidadeAtual + boost > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += boost;
        }
    }

    void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
        } else {
            velocidadeAtual = 0;
        }

    }
}
