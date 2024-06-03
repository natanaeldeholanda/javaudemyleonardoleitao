package generics;

public class CaixaIntTeste {
    public static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(123);
        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);
        CaixaNumero<Number> caixaB = new CaixaNumero<>();
        caixaB.guardar(321);
        System.out.println(caixaB.abrir());

    }
}
