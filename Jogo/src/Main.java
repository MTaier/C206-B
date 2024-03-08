//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Arma arma = new Arma();

        personagem.arma = arma;
        personagem.pontos = 100;
        arma.resistencia = 10;

        personagem.tomarDano();
        personagem.usarArma();
    }
}