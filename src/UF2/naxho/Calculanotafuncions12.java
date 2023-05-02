package UF2.naxho;

import java.util.Scanner;

public class Calculanotafuncions12 {
    private double suma = 0;
    private double media = 0;
    private int minima = 0;
    private Scanner scanner1 = new Scanner(System.in);
    private int[] arraynotas = new int[5];
    private int max = arraynotas[0];
    
    public static void main(String[] args) {
        Calculanotafuncions12 programa = new Calculanotafuncions12();
        programa.inici();
    }
    public void inici() {
        mostrarmenu();
        leerdatos();
        calcularmax();
        calcularmin();
        calcularmedia();
        imprimir();
    }
    private void calcularmedia() {
        for (int i = 0; i < arraynotas.length; i++) {
            suma = suma + arraynotas[i];
        }
        media = suma / arraynotas.length;
    }
    private void imprimir() {
        System.out.print("nota maxima " + max + " nota minima " + minima + " nota media " + media);
    }
    public void mostrarmenu() {
        System.out.println("Porfavor inserte 5 numeros");
    }
    public void leerdatos() {
        for (int i = 0; i < arraynotas.length; i++) {
            arraynotas[i] = scanner1.nextInt();
        }
    }
    public void calcularmax() {

        for (int i = 0; i < arraynotas.length; i++) {
            if (arraynotas[i] > max)
                max = arraynotas[i];
        }
    }
    public void calcularmin() {
        minima = arraynotas[0];
        for (int i = 0; i < arraynotas.length; i++) {
            if (arraynotas[i] < minima)
                minima = arraynotas[i];
        }
    }
}