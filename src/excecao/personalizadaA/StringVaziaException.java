package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

    private String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) {

    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio", nomeDoAtributo);

    }
}
