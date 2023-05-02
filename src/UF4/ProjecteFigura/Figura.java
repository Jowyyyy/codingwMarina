package UF4.ProjecteFigura;

public class Figura {

    public String getFigura() {
        return Figura;
    }

    public void setFigura(String figura) {
        Figura = figura;
    }
    public String Figura;
    public static int id;
         public Figura() {
            id++;
        }
    public static int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void ImprimirDades () {
             //calcularArea();
        System.out.println("La figura amb id " + getId() + " és un " + getFigura());
        System.out.println("L'àrea del " + getFigura() + " és: " + calcularArea());
        System.out.println("--------------");
    }
    public double calcularArea () {
        return 0;
    }

}