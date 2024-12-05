package oo.composicao;

public class Carro {
    final Motor motor;

    Carro() {
        this.motor = new Motor(this);
    }

    void acelerar() {
        if (motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        System.out.println("Ligando motor...");
        motor.ligado = true;
    }

    void desligar() {
        System.out.println("Desligando motor...");
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}
