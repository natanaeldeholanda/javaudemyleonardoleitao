package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);
        Arroz ingrediente1 = new Arroz(.200);
        Feijao ingrediente2 = new Feijao(.100);
        Sorvete sobremesa = new Sorvete(.400);
        System.out.println("Peso antes do jantar: " + convidado.getPeso() + "Kg");
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(sobremesa);
        //Usei o .formatted, pois na classe Pessoa não implementei o
        // .toString e também não consegui utilizar o printf normal
        System.out.printf("Peso após o jantar: %.6sKg".formatted(convidado.getPeso()));
    }
}
