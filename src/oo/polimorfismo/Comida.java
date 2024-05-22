package oo.polimorfismo;

public class Comida {
    private double peso; //Atributo
    //Criando o construtor
    public Comida(double peso) {
        setPeso(peso);
    }
    //Getter
    public double getPeso() {
        return peso;
    }
    //Setter
    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
