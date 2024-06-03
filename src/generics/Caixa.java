package generics;

public class Caixa<T> {
    private T coisa;

    //Usando Generics -> <TIPO>

    public void guardar(T coisa) {
        this.coisa = coisa;
    }
    public T abrir() {
        return coisa;
    }
}
