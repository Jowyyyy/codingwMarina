package UF2.NotaAParaula;
import java.util.Scanner;
public class NotaAParaula {
    private double nota=0;
    private Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        NotaAParaula programa = new NotaAParaula();
        programa.inici();
    }
    private void inici() {
        menu();
        llegirDades();
        CalculNota();
    }
    private void menu() {
        System.out.println("Hola!! Benvolgut/da al programa de nota personal.");
    }
    private void llegirDades() {
        System.out.println("Escriu la nota que has tret: ");
        nota = s.nextDouble();
    }
    private void CalculNota() {
        if (nota>=9&&nota<=10) {
            System.out.print("Excel·lent!!!\n");
        }
        else if (nota>=6.5&&nota<=8.9) {
            System.out.print("Notable\n");
        }
        else if (nota>=5&&nota<=6.45) {
            System.out.print("Aprovat\n");
        }
        else if (nota>=0&&nota<=4.9) {
            System.out.print("Suspès");
        }
        else {
            System.out.print("NOTA INCORRECTA");
        }
    }
}

