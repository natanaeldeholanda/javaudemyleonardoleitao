package colecoes;

import java.util.ArrayList;
import java.util.List;
//O ArrayList não utiliza o hashCode para verificar se tem ou não o objeto;
/*
Pode ser heterogêneo;
Pode ser homogêneo;
Aceita objetos duplicados
É ordenado;
É indexado;
 */

public class ListaList {
    public static void main(String[] args) {
      ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Ana", 25));
        usuarios.add(new Usuario("Carlos", 47));
        usuarios.add(new Usuario("Lia", 39));
        usuarios.add(new Usuario("Bia", 29));
        System.out.println(usuarios.get(1)); //Acessar pelo índice;
        System.out.println("Removido: " + usuarios.remove(1)); //Remover pelo índice;
        System.out.println(usuarios.remove(new Usuario("Bia", 29))); //Remover pelo objeto; Retorna um boolean;
        System.out.println("Tem? " + usuarios.contains(new Usuario("Lia", 39))); //Verificar se tem o objeto; Retorna um boolean;
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
}
