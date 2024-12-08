package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        //Classe criada pra mostrar exemplo de Herança, no caso Monstro e Heroi extends Jogador.
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 20;
        Heroi heroi = new Heroi(10,21);
        System.out.println("Life inicial: " + monstro.life);
        System.out.println("Life inicial: " + heroi.life);
        System.out.println("--------------");
        monstro.atacar(heroi);
        monstro.andar(Direcao.NORTE);
        heroi.andar(Direcao.NORTE);
        heroi.atacar(monstro);
        heroi.atacar(monstro);
        heroi.atacar(monstro);

        System.out.println("Life Heroi após ataque: " + heroi.life);
        System.out.println("Life Monstro após ataque: " + monstro.life);//Mostrou 20 a menos, pois o ataque do heroi é 20;


    }
}
