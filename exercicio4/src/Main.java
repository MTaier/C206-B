import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numAlunos;

        System.out.print("Entre com a quantidade de alunos: ");
        numAlunos = entrada.nextInt();

        switch (numAlunos){
            case 10:
            case 20:
                System.out.println("Utilize a sala I-16");
                break;
            case 30:
                System.out.println("Utilize a sala I-22");
                break;
            default:
                System.out.println("Quantidade de alunos não cadastrada");
                break;
        }
    }
}