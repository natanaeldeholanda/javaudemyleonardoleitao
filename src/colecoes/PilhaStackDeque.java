package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaStackDeque {
    public static void main(String[] args) {
        // Stack/Deque-> Último que entra é o primeiro que sai
        Deque<String> livros = new ArrayDeque<String>();
        livros.add("O Pequeno Príncipe");
        livros.push("O Código Da Vinci");
        livros.push("O Hobbit");

        for(String livro : livros) {
            System.out.println("--------");
            System.out.println(livro);
        }
        System.out.println("--------");

        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        livros.size();
        livros.clear();
        livros.contains("O");
        livros.isEmpty();


    }
}
