import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Asteroide asteroide1 = new Asteroide("Asteroide 1", "Pequeno");
        Asteroide asteroide2 = new Asteroide("Asteroide 2", "Grande");

        Nave nave1 = new Nave("Nave 1", 100, "Normal");
        Nave nave2 = new Nave("Nave 2", 100, "Explosivo");

        nave1.atirar(asteroide1);
        nave1.atirar(asteroide2);
        nave2.atirar(asteroide1);
        nave2.atirar(asteroide2);
    }
}