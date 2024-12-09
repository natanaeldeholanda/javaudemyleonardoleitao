package lambdas;

import java.util.List;
import java.util.function.Supplier;

public class FornecedorSupplier {
    public static void main(String[] args) {
        Supplier<List<String>> umaLista = () -> List.of("Ana", "Bia", "Lia", "Gui");
        System.out.println(umaLista.get());
    }
}
