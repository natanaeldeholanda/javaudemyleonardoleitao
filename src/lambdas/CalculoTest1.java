package lambdas;

public class CalculoTest1 {
    public static void main(String[] args) {
        Calculo calculo = new Somar();
        calculo = new Multiplicar();
        System.out.println(calculo.executar(5, 10));
        System.out.println(calculo.executar(2, 7));
    }
}
