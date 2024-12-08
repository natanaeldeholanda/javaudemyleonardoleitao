package oo.abstrato;

public abstract class Mamifero extends Animal {

    public abstract String mamar();

    //Metodo final, não pode ser sobrescrito nas subclasses
    @Override
    public final String mover() {
        return "Saindo do lugar";
    }
}
