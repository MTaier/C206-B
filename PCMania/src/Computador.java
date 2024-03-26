import java.util.Arrays;

public class Computador {
    String marca;
    float preco;
    SistemaOperacional sistemaOperacional;
    HardwareBasico[] hardwareBasico;
    MemoriaUSB[] memoriaUSB = new MemoriaUSB[1];

    public Computador() {
        sistemaOperacional = new SistemaOperacional();
        hardwareBasico = new HardwareBasico[3];
        for (int i = 0; i < hardwareBasico.length; i++) {
            if (hardwareBasico[i] == null) {
                hardwareBasico[i] = new HardwareBasico();
            }
        }
    }

    void mostraPCConfigs(){
        System.out.println("Marca: " + this.marca +
                "\nPreço: " + this.preco + sistemaOperacional.toString() + Arrays.toString(memoriaUSB));

        for (int i = 0; i < hardwareBasico.length; i++) {
            if (hardwareBasico[i] != null){
                System.out.println(hardwareBasico[i]);
            }
        }
    }

    void addMemoriaUSB(MemoriaUSB musb){
        for(int i = 0; i < memoriaUSB.length; i++){
            if(memoriaUSB[i] == null){
                memoriaUSB[i] = musb;
                break;
            }
        }
    }
}
