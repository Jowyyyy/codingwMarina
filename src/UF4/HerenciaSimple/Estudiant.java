package UF4.HerenciaSimple;

import UF4.Persona.Persona;

public class Estudiant extends Persona {
    public String getCurs() {
        return curs;
    }

    public String getAssignatures() {
        return Assignatures;
    }

    public String getEscola() {
        return Escola;
    }

    public String getNotes() {
        return Notes;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public void setAssignatures(String assignatures) {
        Assignatures = assignatures;
    }

    public void setEscola(String escola) {
        Escola = escola;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    private String curs;
    private String Assignatures;
    private String Escola;
    private String Notes;


}
