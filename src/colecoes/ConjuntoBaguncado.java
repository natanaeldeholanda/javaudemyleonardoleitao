package colecoes;


import java.util.HashSet;
import java.util.Set;

/*
---*** HashSet ***---:
Pode ser heterogêneo;
Pode ser homogêneo;
Pode ser ordenado;
Não aceita objetos duplicados;
Não é indexado
 */
@SuppressWarnings("all")
public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');
        System.out.println("Tamanho é " + conjunto.size());
        conjunto.add("teste");
        conjunto.add('X');
        System.out.println("Tamanho é " + conjunto.size());
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(false));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums); // Interseção entre dois conjuntos
        System.out.println(conjunto);
        conjunto.clear();
        System.out.println(conjunto);
    }
}
