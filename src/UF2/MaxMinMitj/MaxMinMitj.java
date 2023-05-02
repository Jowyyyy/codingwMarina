package UF2.MaxMinMitj;
import java.util.Scanner;
public class MaxMinMitj {
    private Scanner s = new Scanner(System.in);
    private int num=0;
    private double[] llistaNum = new double[5];
    private double notaMin = 0;
    private double notaMax = llistaNum[0];
    private double mitjana = llistaNum[0];
    private double numNums =5;

    public static void main(String[] args) {
        MaxMinMitj programa = new MaxMinMitj();
        programa.inici();
    }
    public void inici() {
        mostrarMenu();
        llegirDades();
        calculaMax();
        calculaMin();
        calculaMItjana();
        imprimir();
    }
    private void mostrarMenu() {
        System.out.print("Hola!! Et donem la benvinguda al calcul de nota màxima, mínima i mitjana (:\n");
    }
    private void llegirDades() {
        System.out.println("Escriu 5 valors.");
        for (int i = 0; i< llistaNum.length;++i){
            llistaNum[i] = s.nextInt();
        }
    }
    private void calculaMax() {
        for (int i = 0;i<llistaNum.length;i++) {
            if (llistaNum[i] > notaMax) {
                notaMax = llistaNum[i];
            }
        }
    }
    private void calculaMin() {
        for (int k = 0;k<llistaNum.length;k++) {
            if (llistaNum[k] < notaMin) {
                notaMin = llistaNum[k];
            }
        }
    }
    private void calculaMItjana() {
        for (int k = 0; k < llistaNum.length; k++) {
            if (llistaNum[k] < 5) {
                num++;
                mitjana = mitjana + llistaNum[k];
            }
        }
    }
            private void imprimir() {
                System.out.print("El num més gran es: " + notaMax + "\n");
                System.out.print("El num més petit es: " + notaMin + "\n");
                System.out.print("La mitjana es: " + mitjana/numNums + "\n");

            }
        }