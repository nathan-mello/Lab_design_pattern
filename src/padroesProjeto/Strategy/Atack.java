package padroesProjeto.Strategy;

import java.util.Random;

public interface Atack {

    Random gerador = new Random(645686879);

    double atack(int atkBase);
}
