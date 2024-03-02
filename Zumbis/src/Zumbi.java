public class Zumbi {
    int vida;
    int qntDentes;
    boolean cabelo;
    String nome;

    void atacar(){
        qntDentes = 100;
        System.out.println("Zumbi atacando...");
    }

    void dancar(){
        System.out.println("Zumbi dancando...");
    }

    void cozinhar(){
        System.out.println("Zumbi cozinhando...");
    }

    void infectar(){
        System.out.println("Zumbi infectando...");
    }
}
