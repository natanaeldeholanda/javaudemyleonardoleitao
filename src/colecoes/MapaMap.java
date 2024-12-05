package colecoes;

import java.util.HashMap;
import java.util.Map;

public class MapaMap {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet()); // Retorna as chaves, e não ordena;
        System.out.println(usuarios.values()); // Retorna os valores, e não ordena;
        System.out.println(usuarios.entrySet()); // Retorna chave e valor, e não ordena;
        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));
        System.out.println(usuarios.get(3));
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(4, "Gui"));

        System.out.println("---***---");
        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }
        System.out.println("---***---");
        for(String valor : usuarios.values()) {
            System.out.println(valor);
        }
        System.out.println("---***---");
        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        }
    }
}
