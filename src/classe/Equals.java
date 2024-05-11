package classe;

public class Equals {

    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Natanael de Holanda";
        u1.email = "natan.holanda@gmail.com";
        Usuario u2 = new Usuario();
        u2.nome = "Natanael de Holanda";
        u2.email = "natan.holanda@gmail.com";
        System.out.println(u1.equals(u2));

    }
}
