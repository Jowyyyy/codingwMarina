package UF4.ProjecteFigura;

public class Cercle extends Figura {

private int radi;

    public int getRadi() {
        return radi;
    }
    public void setRadi(int radi) {
        this.radi = radi;
    }
    public Cercle (int r) {
        radi = r;
        setFigura("Cercle");
}
    public double calcularArea() {
        radi = (int) (Math.pow(radi,2) * Math.PI);
        return radi;
    }
}