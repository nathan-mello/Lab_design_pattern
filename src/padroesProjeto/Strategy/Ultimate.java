package padroesProjeto.Strategy;

public class Ultimate implements Atack{
    @Override
    public double atack(int atkBase) {
        double porcentual = (double) 300/100;
        return atkBase + (porcentual*atkBase);
    }
}
