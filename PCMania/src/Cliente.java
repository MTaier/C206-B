public class Cliente {
    String nome;
    long cpf;
    Computador[] computador = new Computador[5];

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    float calculaTotalCompra() {
        float total = 0;

        for (int i = 0; i < computador.length; i++) {
            if (computador[i] != null) {
                total += computador[i].preco;
            }
        }

        return total;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome=" + nome +
                ", cpf=" + cpf +
                '}';
    }
}
