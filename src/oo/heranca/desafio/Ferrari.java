package oo.heranca.desafio;

public class Ferrari extends Carro {

   Ferrari(){
       super(310);
   }
   Ferrari(int velocidadeMaxima){
       super(velocidadeMaxima);
       boost = 25;
   }

    //Sobrescrevendo o método acelerar da classe carro, pra dar o turbo a ferrari
//    @Override
//    void acelerar() {
//        velocidadeAtual += 30;
//    }


}
