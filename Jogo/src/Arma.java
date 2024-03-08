public class Arma {
    public String nome;
    public int poder;
    public int resistencia;
    public String descricao;

    public void mostarInfoArma(){
        System.out.println(this.nome);
        System.out.println("Dano: " + this.poder);
        System.out.println("Resistência: " + this.resistencia);
    }
}
