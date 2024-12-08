package oo.heranca.desafio;

public interface Luxo {
    public void ligarArcondicionado();
    abstract void desligarArcondicionado();


    //Em interface é possível fazer uma implementação padrão, não é forçado a criar o metodo na classe;
    default int velocidadeDoAr(){
        return 1;
    }
}
