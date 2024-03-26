public class MemoriaUSB {
    String nome;
    int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "MemoriaUSB{" +
                this.nome +
                ", capacidade=" + this.capacidade +
                '}';
    }
}
