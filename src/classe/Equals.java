package classe;

public class Equals {

    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Ana";
        u1.email = "a@b.com";

        Usuario u2 = new Usuario();
        u2.nome = "Ana";
        u2.email = "a@b.com";

        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));


    }
}
