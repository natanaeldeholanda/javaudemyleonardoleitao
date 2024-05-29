package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {

    private String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDoAtributo) {

    }

    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);

    }
}
