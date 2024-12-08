package oo.heranca;

public class Heroi extends Jogador {

   //Sobrescrevendo o metodo criado na classe jogador, pra dizer que agora, o heroi
//   boolean atacar(Jogador oponente) {
//       int deltaX = Math.abs(x - oponente.x);
//       int deltaY = Math.abs(y - oponente.y);
//
//       if (deltaX == 0 && deltaY == 1) {
//           oponente.life -= 10;
//           return true;
//       } else if (deltaX == 1 && deltaY == 0) {
//           oponente.life -= 10;
//           return true;
//       }
//       return false;
//   }

    //Vai atacar mais forte que o mostro.
    public Heroi(int x, int y) {
        super(x, y);
    }

    public boolean atacar(Jogador oponente) {
        boolean atacar1 = super.atacar(oponente);
        boolean atacar2 = super.atacar(oponente);
        return atacar1 || atacar2;
    }

}
