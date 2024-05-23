package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Lamborghini;

public class CarroDesafioTeste {
    public static void main(String[] args) {
        Carro ferrari = new Ferrari(100);
        Carro lamborghini = new Lamborghini(200);
        ferrari.acelerar();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        System.out.println("Velocidade Ferrari: " + ferrari);
        System.out.println("Velocidade Lamborghini: " + lamborghini);

        Ferrari ferrari2 = new Ferrari(300);
        System.out.println(ferrari2.velocidadeDoAr());
        ferrari2.acelerar();
        ferrari2.acelerar();
        ferrari2.ligarTurbo();
        System.out.println("Velocidade Ferrari2: " + ferrari2);
    }
}
