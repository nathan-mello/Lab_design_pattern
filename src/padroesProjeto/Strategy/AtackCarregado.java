package padroesProjeto.Strategy;

public class AtackCarregado implements Atack{
    @Override
    public double atack(int atkBase) {
        double critico = gerador.nextInt(2) * atkBase;
        return atkBase + (atkBase*0.75) + critico;
    }
}
