package padroesProjeto.Strategy;

public class main {

    public static void main(String[] args) {
        Legend personagem = new Legend("ayaka", 500);

        AtackNormal atackNormal = new AtackNormal();
        AtackCarregado atackCarregado =new AtackCarregado();
        Ultimate ultimate = new Ultimate();

        System.out.println("Atack normal");
        personagem.setAtack(atackNormal);
        System.out.println(personagem.atack());
        System.out.println(personagem.atack());
        System.out.println(personagem.atack());


        System.out.println("Atack carregado");
        personagem.setAtack(atackCarregado);
        System.out.println(personagem.atack());
        System.out.println(personagem.atack());
        System.out.println(personagem.atack());

        System.out.println("Ultimate");
        personagem.setAtack(ultimate);
        System.out.println(personagem.atack());
        System.out.println(personagem.atack());
        System.out.println(personagem.atack());

    }
}
