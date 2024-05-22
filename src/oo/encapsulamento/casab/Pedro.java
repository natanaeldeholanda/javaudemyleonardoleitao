package oo.encapsulamento.casab;

import oo.encapsulamento.casaa.Ana;

public class Pedro extends Ana {

    void testeAcesso() {
        Ana mae = new Ana();

        //System.out.println(mae.facoDentroDeCasa);
        //System.out.println(mae.formaDeFalar);
        System.out.println(mae.todosSabem);
        //System.out.println(mae.segredo);
        System.out.println(formaFalar);//Acessando atributos por herança, não pode ser instanciado para acessar
        System.out.println(new Ana().todosSabem);
        System.out.println(todosSabem);

    }

}
