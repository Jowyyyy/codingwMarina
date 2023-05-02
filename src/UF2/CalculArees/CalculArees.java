
package UF2.CalculArees;
import java.util.Scanner;
public class CalculArees {
  private static String figura = "";
  private double area = 0;
  private Scanner s = new Scanner(System.in);
  public static void main (String args[]) {
    CalculArees programa = new CalculArees();
    programa.inici();
  }
  public void inici() {
    menu();
    llegirfigura();
    calcular();
    }
  private void menu() {
    System.out.println("Benvingut al calcul d'àrees!!");
  }
  private void llegirfigura() {
    System.out.println("De quina figura vols calcular l'area?");
    System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle");
    figura = s.nextLine();
  }
  private void calcular() {
    if (figura.equals("Triangle")) {
      Triangle(23.0,8.0);
    }
    else if (figura.equals("Quadrat")) {
      Quadrat(37.0);
    }
    else if (figura.equals("Rectangle")) {
      Rectangle(68.0,39.0);
    }
    else if (figura.equals("Trapezi")) {
      Trapezi(16.0,5.0,35.0);
    }
    else if (figura.equals("Rombe")) {
      Rombe(75.0,30.0);
    }
    else if (figura.equals("Paralelogram")) {
      Paralelogram(45.0,13.0);
    }
    else if (figura.equals("Cercle")) {
      Cercle(45.0,13.0);
    }
    imprimir();
  }
  public void Triangle(double b, double h){
    area = (b*h)/2;
  }
  public void Quadrat(double r){
    area = Math.pow(r, 2);
  }
  public void Rectangle(double a, double b){
    area = a*b;
  }
  public void Trapezi(double b, double h, double a){
    area = ((a*b)*h)/2;
  }
  public void Rombe(double Dm, double dm){
    area = (Dm*dm)/2;
  }
  public void Paralelogram(double b, double h) {
    area = b * h;
  }
  public void Cercle(double b, double h){
    area = b*h;
  }
  private void imprimir() {
    System.out.println("L'àrea de "+figura+" es "+area);
  }
}