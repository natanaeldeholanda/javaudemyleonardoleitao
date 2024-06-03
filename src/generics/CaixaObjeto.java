package generics;

public class CaixaObjeto {
    private Object coisa;

    //Métodos get e set, utilizando outra nomenclatura;

    public void guardar(Object coisa) {
        this.coisa = coisa;
    }
    public Object abrir() {
        return coisa;
    }
}
