package colecoes;

import java.util.HashMap;
import java.util.Map;

public class MapaMap {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(14, "Roberto");
        usuarios.put(20, "Rafaela");
        usuarios.put(31, "Rebecca");
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(13));
        System.out.println(usuarios.containsValue("Rebecca"));
        System.out.println(usuarios.get(31));
        System.out.println(usuarios.remove(14, "Rafaela"));
        System.out.println("-----------------");
        //Percorer elementos do MAp
        for(int chave : usuarios.keySet()) {
            System.out.println(chave);
        }
        System.out.println("-----------------");
        for(String valor : usuarios.values()) {
            System.out.println(valor);
        }
        System.out.println("-----------------");

        for(Map.Entry<Integer, String> usuario : usuarios.entrySet()) {
            System.out.println(usuario.getKey() + " - " + usuario.getValue());
        }

    }
}
