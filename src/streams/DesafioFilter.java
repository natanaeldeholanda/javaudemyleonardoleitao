package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        CarroDesafioFilter carro1 = new CarroDesafioFilter("C3", "Citroën", true);
        CarroDesafioFilter carro2 = new CarroDesafioFilter("C4 Cactus", "Citroën", false);
        CarroDesafioFilter carro3 = new CarroDesafioFilter("208", "Peugeot", true);
        CarroDesafioFilter carro4 = new CarroDesafioFilter("Gol G4", "Volksvagen", false);
        CarroDesafioFilter carro5 = new CarroDesafioFilter("Bronco", "Ford", true);
        CarroDesafioFilter carro6 = new CarroDesafioFilter("Polo", "Volksvagen", true);
        CarroDesafioFilter carro7 = new CarroDesafioFilter("Onix", "Chevrolet", true);
        CarroDesafioFilter carro8 = new CarroDesafioFilter("Kardian", "Renault", true);

        List<CarroDesafioFilter> carros = Arrays.asList(carro1, carro2, carro3, carro4, carro5, carro6, carro7, carro8);
        Predicate<CarroDesafioFilter> carrosAutomatico = automatico -> automatico.automatico;
        Function<CarroDesafioFilter, String> impressao = carro -> carro.marca + " " + carro.nome + " é automático? " + carro.automatico;

        carros.stream().filter(carrosAutomatico).map(impressao).forEach(System.out::println);
    }
}
