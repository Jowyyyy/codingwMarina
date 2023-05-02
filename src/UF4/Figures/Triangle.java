package UF4.Figures;

public class Triangle {
    public int costat1;
    public int costat2;
    public int costat3;
    public String color;
    public Triangle(){}
    public Triangle(int cos1,int cos2,int cos3, String col){
        cos1=costat1;
        cos2=costat2;
        cos3=costat3;
        col=color;
    }

    public int getCostat1() {
        return costat1;
    }

    public void setCostat1(int costat1) {
        this.costat1 = costat1;
    }
}
