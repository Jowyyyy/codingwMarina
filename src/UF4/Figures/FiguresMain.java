package UF4.Figures;

public class FiguresMain {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.color = "blau";

       /* Rectangle r2 = new Rectangle();
        r2.base = 5;
        r2.alçada = 3;
        r2.color = "verd";*/

        Rectangle r2 = new Rectangle(5,3);
        r2.color = "verd";
        /*Rectangle r3 = new Rectangle();
        r3.base = 6;
        r3.alçada = 4;
        r3.color = "rosa";*/
        Rectangle r3 = new Rectangle(6,4,"rosa");
        Quadrat q1 = new Quadrat();
        Quadrat q2 = new Quadrat (3,"vermell");
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(4,4,3,"verd");
        Cercle c1 = new Cercle();
        Cercle c2 = new Cercle(2.5,"blau");
    }
}