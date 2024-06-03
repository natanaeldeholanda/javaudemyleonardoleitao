package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("Java", "Python", "C#", "C++", "PHP");
        List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem);
        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(numbs);
        System.out.println(ultimoNumero);

        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem2);
        Integer ultimoNumero2 = ListaUtil.getUltimo2(numbs);
        System.out.println(ultimoNumero2);
    }
}
