//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.motor.cilindradas = "100";
        kart2.motor.cilindradas = "150";

        kart1.motor.velocidadeMaxima = 142.33f;
        kart2.motor.velocidadeMaxima = 127.59f;

        piloto1.nome = "Mario";
        piloto2.nome = "Luigi";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        piloto1.soltaSuperPoder();
        kart1.motor.mostraInfo();
        kart2.fazerDrift();
    }
}