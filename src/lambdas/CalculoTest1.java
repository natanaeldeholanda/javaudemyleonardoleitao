package lambdas;

public class CalculoTest1 {
    public static void main(String[] args) {
        Calculo calculo = new Somar();
        Calculo calculo2 = new Multiplicar();
        Calculo calculo3 = new Dividir();
//        calculo = new Dividir();
        System.out.println("Somar "+ calculo.executar(7, 2));
        System.out.println("Somar "+ calculo.executar(8, 2));
        System.out.println("Multiplicar "+ calculo2.executar(5, 10));
        System.out.println("Dividir "+ calculo3.executar(5, 10));
    }
}
