package UF4.ProjecteFigura;

public class Quadrat extends Figura {
    private int costat;
    public Quadrat() {

    }
    public int getCostat() {
        return costat;
    }

    public void setCostat(int costat) {
        this.costat = costat;
    }

    public Quadrat(int r) {
    costat = r;
    setFigura("Quadrat");
    }

    public double calcularArea() {

        costat = (int) Math.pow(costat,2);
        return costat;
    }
}