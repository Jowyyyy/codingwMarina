package UF4.ProjecteFigura;

public class Rombe extends Figura {
    private int dM;
    public int dm;

    public int getdM() {
        return dM;
    }

    public void setdM(int dM) {
        this.dM = dM;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }

    public Rombe (int dM, int dm) {
        this.dM = dM;
        this.dm = dm;
        setFigura("Rombe");
    }
    public double calcularArea() {
        dM = dM*dm/2;
        return dM;
    }
}
