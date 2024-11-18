package controle;

public class For1 {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 10) {
            System.out.printf("i = %d \n", contador);
            contador++;
        }
        System.out.println("Saída do FOR");
        for (contador = 0; contador <= 10; contador += 2) {
            System.out.printf("i = %d \n", contador);
        }
    }
}
