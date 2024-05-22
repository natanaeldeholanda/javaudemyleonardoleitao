package oo.encapsulamento.casab;

import oo.encapsulamento.casaa.Ana;

public class Julia {

    void testeAcessos(){
        Ana sogra = new Ana();

        System.out.println(sogra.todosSabem);//Só acessa, pois está no mesmo pacote encapsulamento
//        System.out.println(sogra.facoDentroDeCasa);
//        System.out.println(sogra.formaDeFalar);
//        System.out.println(sogra.segredo);
    }

}
