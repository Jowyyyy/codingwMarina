package UF4.ProjecteFigura;

public class Trapezi extends Figura {

    private int a;
    private int b;
    private int h;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Trapezi (int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
        setFigura("Trapezi");
    }

    public double calcularArea() {
         a = (a + b) * h / 2;
        return a;
    }
}
