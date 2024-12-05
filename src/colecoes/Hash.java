package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();
        usuarios.add(new Usuario("Ana", 25));
        usuarios.add(new Usuario("Pedro", 23));
        usuarios.add(new Usuario("Rafaela",28));
        boolean resultado = usuarios.contains(new Usuario("Ana",25));
        System.out.println(resultado);
    }
}
