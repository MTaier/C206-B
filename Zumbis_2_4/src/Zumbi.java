public class Zumbi {
    double vida;
    String nome;
    boolean transferencia = false;

    double mostraVida(){
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        if (quantia <= vida){
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            transferencia = true;
            System.out.println("Transferencia realizada com sucesso, transferencia: " + transferencia);
        }
        else{
            System.out.println("Vida insuficiente, transferencia: " + transferencia);
        }
    }
}
