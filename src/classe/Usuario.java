package classe;

public class Usuario {
    String nome;
    String email;

    @Override
    //Sobrescrevendo o método equals para comparar 2 objetos
    public boolean equals(Object objeto) {
        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return super.equals(objeto);
        } else {
            return false;
        }
    }
}
// O hashCode será abordado em outra aula
