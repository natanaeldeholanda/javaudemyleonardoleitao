package colecoes;


import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjuntoBaguncado = new HashSet();
        conjuntoBaguncado.add("A");
        conjuntoBaguncado.add("B");
        conjuntoBaguncado.add("C");
        conjuntoBaguncado.add(123);
        conjuntoBaguncado.add(true);
        conjuntoBaguncado.add('x');
        conjuntoBaguncado.add(1.2);

        System.out.println("Tamanho do HashSet: " + conjuntoBaguncado.size());
        System.out.println("Verifica se tem do HashSet: " + conjuntoBaguncado.contains(123));

        Set nums = new HashSet();
        nums.add(123);
        nums.add(456);
        nums.add(789);
        System.out.println(nums);
        System.out.println(conjuntoBaguncado);
        //União dos dois conjuntos
        conjuntoBaguncado.addAll(nums);
        System.out.println(conjuntoBaguncado);
        //Mostra os valores em comum
        conjuntoBaguncado.retainAll(nums);
        System.out.println(conjuntoBaguncado);
        conjuntoBaguncado.clear();
        System.out.println(conjuntoBaguncado);

    }
}
