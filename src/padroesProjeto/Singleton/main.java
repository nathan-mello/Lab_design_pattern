package padroesProjeto.Singleton;

public class main {

    public static void main(String[] args) {

        SingletonSimples instance01 = SingletonSimples.getInstance();
        SingletonSimples instance02 = SingletonSimples.getInstance();

        System.out.println(instance01);
        System.out.println(instance02);
    }
}
