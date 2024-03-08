public class Personagem {
    public String nome;
    public int pontos;
    public Arma arma;

    public void usarArma(){
        arma.resistencia -= 2;
        System.out.println(arma.resistencia);
    }

    public void tomarDano(){
        this.pontos -= 5;
        System.out.println(this.pontos);
    }
}
