package UF4.ProjecteFigura;

public class Paralelogram extends Figura  {
private int b;
private int h;

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

    public Paralelogram (int b, int h) {
        this.h = h;
        this.b = b;
        setFigura("Paralelogram");
        }
    public double calcularArea() {
        h = b*h;
        return h;
    }
}
