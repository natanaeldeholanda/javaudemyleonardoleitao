package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> listaAprovados = new HashSet<>(); //Mostra por ordem de inserção
        listaAprovados.add("ListaList");
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucca");
        listaAprovados.add("Pedro");
        for (String candidatos : listaAprovados) {
            System.out.println(candidatos);
        }
        System.out.println("-------------------");
        Set<Integer> nunsOrdem = new TreeSet<>(); // Mostra ordenado por ordem alfabética
        nunsOrdem.add(7);
        nunsOrdem.add(2);
        nunsOrdem.add(5);
        nunsOrdem.add(3);
        nunsOrdem.add(8);
        for(int nums : nunsOrdem){
            System.out.println(nums);
        }

    }
}
