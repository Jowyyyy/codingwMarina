package UF2.ParamEntrada;

public class EscriureEstrelles {
    public static void main(String[] args) {
        EscriureEstrelles programa = new EscriureEstrelles();
        programa.inici();
    }
    public void inici() {
        estrellar(4);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
    }
    public void estrellar(int a) {
        for (int k = 0; k < a;k++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}