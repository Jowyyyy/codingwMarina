package UF4.Empresa;

public class TipusProducte {
    private String nom;
    private int CodiIdentificador;
    private double preu;
    private int estoc;
    public TipusProducte(String n1, int es) {
        n1=nom;
        es=estoc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCodiIdentificador() {
        return CodiIdentificador;
    }

    public void setCodiIdentificador(int codiIdentificador) {
        CodiIdentificador = codiIdentificador;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getEstoc() {
        return estoc;
    }

    public void setEstoc(int estoc) {
        this.estoc = estoc;
    }

    public boolean isaLaVenda() {
        return aLaVenda;
    }

    public void setaLaVenda(boolean aLaVenda) {
        this.aLaVenda = aLaVenda;
    }

    private boolean aLaVenda;
}
