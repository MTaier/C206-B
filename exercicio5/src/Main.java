import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        System.out.print("Entre com um numero inteiro (entre 0 e 10) e tente adivinhar o numero aleatorio: ");
        numero = entrada.nextInt();

        while(numero != x){
            System.out.println("Errou, tente novamente");
            numero = entrada.nextInt();
        }

        System.out.println("Parabéns!");
    }
}