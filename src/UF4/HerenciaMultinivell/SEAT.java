package UF4.HerenciaMultinivell;

public class SEAT extends Car{
    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String getFuncions() {
        return Funcions;
    }

    @Override
    public void setFuncions(String funcions) {
        Funcions = funcions;
    }

    private int model;
    private String Funcions;
    public void Brand(){

    }
    public void Speed(){

    }
}
