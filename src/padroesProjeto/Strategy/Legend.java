package padroesProjeto.Strategy;

public class Legend {
    private String name;
    private int baseAtack;
    private Atack atack;

    public Legend(String name, int baseAtack) {
        this.name = name;
        this.baseAtack = baseAtack;
        this.atack = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseAtack() {
        return baseAtack;
    }

    public void setBaseAtack(int baseAtack) {
        this.baseAtack = baseAtack;
    }

    public Atack getAtack() {
        return atack;
    }

    public void setAtack(Atack atack) {
        this.atack = atack;
    }

    public double atack(){
        return atack.atack(baseAtack);
    }
}
