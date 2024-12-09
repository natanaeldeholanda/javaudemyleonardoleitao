package lambdas;
@FunctionalInterface // Interface funcional só pode ter um metodo abstrato
public interface Calculo {
    double executar(double a, double b);

    default String legal() {
        return "legal";
    }
    static String muitoLegal(){
        return "muito legal";
    }
}
