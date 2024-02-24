import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int lanche1 = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        int lanche2 = entrada.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        float media = total/3.0f;

        System.out.println("Total de lanches: " + total);
        System.out.println("Media de lanches: " + media);
    }
}