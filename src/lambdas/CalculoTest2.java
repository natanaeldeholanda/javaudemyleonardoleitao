package lambdas;

public class CalculoTest2 {
    public static void main(String[] args) {
        //Implementando o metodo executar, via lambida;
        Calculo somar = (a, b) -> {
            return a + b;
        };
        System.out.println("Chamando a adição: " + somar.executar(4, 5));
        Calculo multiplicar = (a, b) -> {
            return a * b;
        };
        somar = (x, y) -> x / y;

        System.out.println("Chamando a multiplicação: " + multiplicar.executar(4, 5));
        System.out.println("Chamando a divisão: " + somar.executar(6, 3));
        System.out.println(somar.legal());
        System.out.println(Calculo.muitoLegal());

    }
}
