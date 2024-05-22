package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean ligarArcondicionado;

    Ferrari() {
        super(310);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setBoost(25);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarArcondicionado() {
        ligarArcondicionado = true;
    }

    @Override
    public void desligarArcondicionado() {
        ligarArcondicionado = false;
    }

    @Override
    public int getBoost() {
        if (ligarTurbo && !ligarArcondicionado) {
            return 35;
        } else if (ligarTurbo && ligarArcondicionado) {
            return 30;

        } else if (!ligarTurbo && !ligarArcondicionado) {
            return 25;
        } else {
            return 15;
        }
    }

    //Sobrescrevendo o método acelerar da classe carro, pra dar o turbo a ferrari
    // nunca poderá diminuir o nível de visibilidade, porém aumentar pode
//    @Override
//    void acelerar() {
//        velocidadeAtual += 30;
//    }


}
