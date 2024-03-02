//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        zumbi1.nome = "Chris";
        zumbi1.vida = 10000;
        zumbi1.qntDentes = 0;
        zumbi1.cabelo = false;

        zumbi1.atacar();
        zumbi1.cozinhar();

        Zumbi zumbi2 = new Zumbi();
        zumbi2.nome = "QualquerNome";
        zumbi2.qntDentes = 99;

        System.out.println("Quantidade de dentes do zumbi2 " + zumbi2.qntDentes);
        zumbi2.atacar();
        System.out.println("Quantidade de dentes do zumbi2 " + zumbi2.qntDentes);
    }
}