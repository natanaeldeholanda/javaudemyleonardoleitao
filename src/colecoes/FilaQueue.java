package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.add("Ana"); //Adiciona um elemento na fila, retornando uma exceção caso a fila esteja cheia;
        fila.offer("Bia"); //Adiciona um elemento na fila, retornando false caso a fila esteja cheia;
        fila.add("Carlos"); //Adiciona um elemento na fila;
        fila.offer("Daniel"); //Adiciona um elemento na fila;
        fila.add("Rafaela"); //Adiciona um elemento na fila;
        fila.offer("Gui"); //Adiciona um elemento na fila;
        System.out.println(fila.peek()); //Retorna o primeiro elemento da fila; Se a fila estiver vazia, retorna null;
        System.out.println(fila.element()); //Retorna o primeiro elemento da fila; Se a fila estiver vazia, retorna uma exceção;

        fila.size(); //Retorna o tamanho da fila;
        fila.clear(); //Limpa a fila;
        fila.isEmpty(); //Verifica se a fila está vazia;
        fila.poll(); //Remove o primeiro elemento da fila; Se a fila estiver vazia, retorna null;
        fila.remove(); //Remove o primeiro elemento da fila; Se a fila estiver vazia, retorna uma exceção;
        fila.contains("Carlos"); //Verifica se a fila contém o elemento; Retorna um boolean;
    }
}
