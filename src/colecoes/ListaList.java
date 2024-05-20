package colecoes;

import java.util.ArrayList;
import java.util.List;
//O ArrayList não utiliza o hashCode para verificar se tem ou não o objeto;

public class ListaList {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Ana",25);
        lista.add(u1);
        lista.add(new Usuario("Carlos",23));
        lista.add(new Usuario("Lia",24));
        lista.add(new Usuario("Manu",29));
        lista.add(new Usuario("Bia",29));
        lista.add(new Usuario("Carlos",23));
        lista.add(new Usuario("Manu",29));
        System.out.println(lista.get(3));
        System.out.println(lista.remove(3));
        System.out.println(lista.remove(new Usuario("Manu",29)));
        System.out.println(lista.contains(new Usuario("Carlos",23)));

        for (Usuario u : lista) {
            System.out.println(u);
        }
    }
}
