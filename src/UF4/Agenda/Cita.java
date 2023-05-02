package UF4.Agenda;

/**
 *
 */
public class Cita {
    int hora;
    int minuts;
    String titol;
    String text;
    public Cita(){}
    public Cita modificarText(int hora, int minuts, String titol, String text){
        this.hora=hora;
        this.minuts=minuts;
        this.titol=titol;
        this.text=text;
        return null;
    }
}