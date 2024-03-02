//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();
        Zumbi z3 = new Zumbi();
        Zumbi z4 = new Zumbi();

        z1.vida = 56.94;
        z2.vida = 25.34;
        z3.vida = 98.17;
        z4.vida = 35.61;

        z1 = z2;

        z2.vida = 44.96;

        System.out.println(z1.mostraVida());
        System.out.println(z2.mostraVida());

        System.out.println(z3.mostraVida());
        System.out.println(z4.mostraVida());
        z3.transfereVida(z4, 50);
        System.out.println(z3.mostraVida());
        System.out.println(z4.mostraVida());

    }
}