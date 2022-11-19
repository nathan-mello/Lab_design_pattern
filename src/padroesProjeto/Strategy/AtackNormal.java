package padroesProjeto.Strategy;


public class AtackNormal implements Atack{

    // Ataque normal
    @Override
    public double atack(int atkBase) {
        double critico = gerador.nextInt(2);
        return atkBase + (atkBase * critico);
    }


}
