public class Cantina {
    public String nome;
    public Salgado[] salgados = new Salgado[10];

    public void addSalgado(Salgado novoSalgado){
        for (int i = 0; i < salgados.length; i++) {
            if(salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    public void mostraInfo(){
        for (Salgado salgado : salgados) {
            if (salgado != null) {
                System.out.println(salgado.nome);
            }
        }
    }
}
