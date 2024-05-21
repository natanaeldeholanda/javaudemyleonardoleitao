package oo.heranca.desafio;

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

        Carro ferrari2 = new Ferrari(300);
        ferrari2.acelerar();
        ferrari2.acelerar();
        System.out.println("Velocidade Ferrari2: " + ferrari2);
    }
}
