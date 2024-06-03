package generics;

import java.util.List;

public class ListaUtil {
    public static Object getUltimo1(List<?> lista){
        //Pegando o último elemento da lista, usando índice;
        return lista.get(lista.size()-1);
    }

    public static<T> T getUltimo2(List<T> lista){
        //Esse tipo de construção, não precisa se preocupar com Cast;
        return lista.get(lista.size()-1);
    }

    public static <A,B,C> C teste(A paramA, B paramB){
        C teste = null;
        return teste;
    }
}
