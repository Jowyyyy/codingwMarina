package UF4.ProjecteFigura;

public class Triangle extends Figura {
    private int base;
    private int h;
    public Triangle() {

    }

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    public Triangle (int b, int a) {
        base = b;
        h = a;
        setFigura("Triangle");
    }


    public double calcularArea() {
        h = (base*h)/2;
        return h;
    }
}
