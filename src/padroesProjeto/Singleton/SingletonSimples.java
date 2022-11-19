package padroesProjeto.Singleton;

/**
 * @author Nathan Mello
 */
public class  SingletonSimples {

    private static SingletonSimples instance;

    private static SingletonSimples SingletonSimples() {
        if(instance==null){
            instance = new SingletonSimples();
        }
        return instance;
    }

    public static SingletonSimples getInstance(){
        return SingletonSimples();
    }
}
