package oo.polimorfismo;

public class Pessoa {
    private double peso;
    //Contrutor
    public Pessoa(double peso) {
        setPeso(peso);
    }
    //Metodo, não precisa usar o extends pois pessoa não é comida
    public void comer(Comida comida) {
        this.peso += comida.getPeso();
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
