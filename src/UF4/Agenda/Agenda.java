package UF4.Agenda;

public class Agenda {
    int any;
    public Agenda(){}
    public Agenda(int a){

        a=any;
    }
  public void AvançarPagina () {

  }
  public void RetrocecirPagina(){

  }
  public Pagina LlegirPagina(){
      Pagina P=new Pagina();
      return P;
  }

    public int getAny() {

      return any;
    }

    public void setAny(int any) {

      this.any = any;
    }
}
