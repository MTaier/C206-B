import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int promocao;

        Cliente cliente = new Cliente("Zé", 11122233345L);

        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();

        MemoriaUSB memoriaUSB1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB memoriaUSB2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB memoriaUSB3 = new MemoriaUSB("HD Externo", 1);

        computador1.hardwareBasico[0].nome = "Platinum Core i3";
        computador1.hardwareBasico[0].capacidade = 2200;
        computador1.hardwareBasico[1].nome = "Memoria RAM";
        computador1.hardwareBasico[1].capacidade = 8;
        computador1.hardwareBasico[2].nome = "HD";
        computador1.hardwareBasico[2].capacidade = 500;

        computador2.hardwareBasico[0].nome = "Platinum Core i5";
        computador2.hardwareBasico[0].capacidade = 3370;
        computador2.hardwareBasico[1].nome = "Memoria RAM";
        computador2.hardwareBasico[1].capacidade = 16;
        computador2.hardwareBasico[2].nome = "HD";
        computador2.hardwareBasico[2].capacidade = 1;

        computador3.hardwareBasico[0].nome = "Platinum Core i7";
        computador3.hardwareBasico[0].capacidade = 4500;
        computador3.hardwareBasico[1].nome = "Memoria RAM";
        computador3.hardwareBasico[1].capacidade = 32;
        computador3.hardwareBasico[2].nome = "HD";
        computador3.hardwareBasico[2].capacidade = 2;

        computador1.marca = "Positivo";
        computador1.preco = 3300.00f;
        computador1.sistemaOperacional.nome = "Linux Ubuntu";
        computador1.sistemaOperacional.tipo = 32;
        computador1.addMemoriaUSB(memoriaUSB1);

        computador2.marca = "Acer";
        computador2.preco = 8800.00f;
        computador2.sistemaOperacional.nome = "Windows 8";
        computador2.sistemaOperacional.tipo = 64;
        computador2.addMemoriaUSB(memoriaUSB2);

        computador3.marca = "Vaio";
        computador3.preco = 4800.00f;
        computador3.sistemaOperacional.nome = "Windows 10";
        computador3.sistemaOperacional.tipo = 64;
        computador3.addMemoriaUSB(memoriaUSB3);

        System.out.println("Promoção 1 - PC Positivo | Promoção 2 - PC Acer | Promoção 3 - PC Vaio");

        do {
            System.out.println("Qual PC você deseja comprar? (0 para sair)");
            promocao = entrada.nextInt();

            for (int i = 0; i < cliente.computador.length; i++) {
                if (cliente.computador[i] == null) {
                    switch (promocao) {
                        case 0:
                            System.out.println("Obrigado por visitar nossa loja. Volte sempre!");
                            break;
                        case 1:
                            cliente.computador[i] = computador1;
                            break;
                        case 2:
                            cliente.computador[i] = computador2;
                            break;
                        case 3:
                            cliente.computador[i] = computador3;
                            break;
                        default:
                            System.out.println("Escolha uma opção válida");
                    }
                    break;
                }
            }
        } while (promocao != 0);

        System.out.println(cliente);
        System.out.println(cliente.calculaTotalCompra());

        for (int i = 0; i < cliente.computador.length; i++) {
            if (cliente.computador[i] != null) {
                cliente.computador[i].mostraPCConfigs();
            }
        }
    }
}