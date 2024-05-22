package oo.heranca.desafio;

public class Lamborghini extends Carro {
//Chamando o construtor padrão
    Lamborghini(){
        super(300);
    }
//Chamando o construtor, com o parâmetro ca classe Carro
    public Lamborghini(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    public void acelerar() {
        velocidadeAtual += 10;
    }
}
