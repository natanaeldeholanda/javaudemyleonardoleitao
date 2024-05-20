package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.add("Ana"); //add-> caso não consiga adicionar, retorna uma exceção;
        fila.offer("Bella"); //offer-> caso não consiga adicionar, retorna false;
        fila.offer("Carlos"); //offer-> caso não consiga adicionar, retorna false;
        fila.offer("Daniel"); //offer-> caso não consiga adicionar, retorna false;
        fila.offer("Pedro"); //offer-> caso não consiga adicionar, retorna false;
        fila.offer("Gui"); //offer-> caso não consiga adicionar, retorna false;

        //peek e element-> obter o próximo elemento da fila (sem remover);
        //pool e remove-> obert o próximo elemento da fila e remove;
        // fila.size();
        // fila.clear;
        // fila.isEmpty();
        // fila.poll();
        // fila.remove();
        // fila.contains();
        System.out.println(fila.peek()); // Retorna null quando a fila está vazia;
        System.out.println(fila.element()); // Lança uma exceção quando a fila está vazia;

    }
}
