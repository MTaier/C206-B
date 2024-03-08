public class Kart {
    public String nome;
    Piloto piloto;
    Motor motor;

    public Kart() {
        motor = new Motor();
    }

    public void pular(){
        System.out.println("Pulando");
    }

    public void soltarTurbo(){
        System.out.println("Turbo");
    }

    public void fazerDrift(){
        System.out.println("Drift");
    }
}
