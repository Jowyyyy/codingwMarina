package UF4.ProjecteFigura;
public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(12, 45);

        t1.ImprimirDades();
        Paralelogram p1 = new Paralelogram(54, 43);
        p1.ImprimirDades();
        Quadrat q1 = new Quadrat(345);
        q1.ImprimirDades();
        Rectangle r1 = new Rectangle();
        r1.setCostat1(45);
        r1.setCostat2(78);
        r1.ImprimirDades();
        Rombe r2 = new Rombe(56, 65);
        r2.ImprimirDades();
        Trapezi t2 = new Trapezi(65, 75, 32);
        t2.ImprimirDades();
        Cercle c1 = new Cercle(4);
        c1.ImprimirDades();
    }
}