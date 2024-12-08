package oo.encapsulamento;

@SuppressWarnings("ALL")
public class Pessoa {
    private String nome;
    private final String sobrenome;
    private int idade;

    public Pessoa(String nome, String sobrenome, int idade) {
        setIdade(idade);
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Olá, me chamo " + nome + " e tenho " + idade + " anos.";
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String nomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade); //Não deixar a idade ser negativa e convertendo se a mesma for :/
        if (novaIdade > this.idade && novaIdade <= 120) { //Deixando idade para não ser menor que zero e não ser maior que 120
            this.idade = novaIdade;
        }
    }

}
