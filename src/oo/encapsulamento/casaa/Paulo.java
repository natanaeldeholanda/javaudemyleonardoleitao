package oo.encapsulamento.casaa;

public class Paulo {
    Ana esposa = new Ana();

    void testeAcessos() {
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaFalar);
        System.out.println(esposa.todosSabem);
        //System.out.println(esposa.segredo); -> Não consegue acessar, pois está atribuído como private;
    }

}
