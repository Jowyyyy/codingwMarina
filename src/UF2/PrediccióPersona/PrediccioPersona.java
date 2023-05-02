package UF2.PrediccióPersona;

import java.util.Scanner;
//Un programa que calcula descomptes.
public class PrediccioPersona {
  private int edat=0;
  private String mesNaixement="";
  private String nom ="";
  private Scanner s = new Scanner(System.in);
  private int numSort = 0;
  private String equipFutbol ="";
  private String llenguatgeProgramacio = "";
  public static void main (String[] args) {
    PrediccioPersona programa = new PrediccioPersona();
    programa.inici();
  }
  public void inici () {
    menu();
    LlegirNaixement();
    LlegirNom();
    LlegirAnys();
    Calcular();
  }
  public void menu() {
    System.out.print("Hola!! Benvolgut/da al programa de predicció personal.");
  }
  public void LlegirNaixement() {
    System.out.print("Escriu el mes en què vas nèixer.");
    System.out.print("\n");
    System.out.print("Gener\tFebrer\tMarc\n");
    System.out.print("Abril\tMaig\tJuny\n");
    System.out.print("Juliol\tAgost\tSetembre\n");
    System.out.print("Octubre\tNovembre\tDesembre");
    System.out.print("\n\n");
    //recollim la dada a la variable mesNaixement
    mesNaixement = s.nextLine();
  }
  public void LlegirNom() {
    System.out.print("\n");
    System.out.print("Com et dius?\n");

    //recollim la dada a la variable nom
    nom = s.nextLine();
  }
  public void LlegirAnys() {
    System.out.print("\n");
    System.out.print("Per acabar, quants anys tens?\n");
    //recollim la dada a la variable edat
    edat = s.nextInt();
  }
  public void Imprimir() {
    System.out.print("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
    System.out.print("\n\n");

    System.out.print(">>> El teu número de la sort és el " + numSort + "!");
    System.out.print("\n\n");

    System.out.print(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
    System.out.print("\n\n");

    System.out.print(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + "!");
    System.out.print("\n\n");

    System.out.print("Torna quan vulguis!\n");
    System.out.print("------------------------------------------------\n\n\n");
  }
  //declarem l'element scanner per a poder saber què ens escriu l'usuari
    //per terminal
    //demanem a l'usuari el mes en què va nèixer


    //demanem a l'usuari el mes en què va nèixer

    //demanem a l'usuari la seva edat

    //Inicialitzem les variables que necessitarem per qualsevol cas


    //fem els condicionals necessaris

  public void Calcular() {

    if (mesNaixement.equals("Gener") || mesNaixement.equals("gener")) {
    Gener();
    }
    else if (mesNaixement.equals("Febrer")|| mesNaixement.equals("febrer")){
    Febrer();
    }
    else if (mesNaixement.equals("Marc")|| mesNaixement.equals("marc")){
    Marc();
    }
    else if (mesNaixement.equals("Abril")|| mesNaixement.equals("abril")){
    Abril();
    }
    else if (mesNaixement.equals("Maig")|| mesNaixement.equals("maig")){
    Maig();
    }
    else if (mesNaixement.equals("Juny")|| mesNaixement.equals("juny")){
    Juny();
    }
    else if (mesNaixement.equals("Juliol")|| mesNaixement.equals("juliol")){
    Juliol();
    }
    else if (mesNaixement.equals("Agost")|| mesNaixement.equals("agost")){
    Agost();
    }
    else if (mesNaixement.equals("Setembre")|| mesNaixement.equals("setembre")){
    Septembre();
    }
    else if (mesNaixement.equals("Octubre")|| mesNaixement.equals("octubre")){
    Octubre();
    }
    else if (mesNaixement.equals("Novembre")|| mesNaixement.equals("novembre")){
    Novembre();
    }
    else if (mesNaixement.equals("Desembre")|| mesNaixement.equals("desembre")) {
    Desembre();
    }
    else {
      numSort = 0;
      equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
      llenguatgeProgramacio = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
      System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
    }
    Imprimir();
  }
  public void Gener() {
    equipFutbol="Bayern de Munich";
    llenguatgeProgramacio="C++";
    numSort = edat * 3/2;
  }
  public void Febrer() {
    equipFutbol="Atletico de Madrid";
    llenguatgeProgramacio="Phyton";
    numSort = edat - 4;
  }
  public void Marc() {
    equipFutbol="Chelsea";
    llenguatgeProgramacio="JavaScript";
    numSort = edat / 2;
  }
  public void Abril() {
    equipFutbol="Manchester City";
    llenguatgeProgramacio="Node.js";
    numSort = edat % 4;
  }
  public void Maig() {
    equipFutbol="Liverpool";
    llenguatgeProgramacio="React";
    numSort = edat * 3/6;
  }
  public void Juny() {
    equipFutbol="Real Mandril";
    llenguatgeProgramacio="C#";
    numSort = edat + edat;
  }
  public void Juliol() {
    equipFutbol="BVB";
    llenguatgeProgramacio="Swift";
    numSort = edat * edat / 5;
  }
  public void Agost() {
    equipFutbol="FCB";
    llenguatgeProgramacio="Java";
    numSort = edat * 1/2 * edat;
  }
  public void Septembre() {
    equipFutbol="Juventus";
    llenguatgeProgramacio="PHP";
    numSort = edat / edat;
  }
  public void Octubre() {
    equipFutbol="PSG";
    llenguatgeProgramacio="R";
    numSort = edat * 4 / 3;
  }
  public void Novembre() {
    equipFutbol="Sevilla CF";
    llenguatgeProgramacio="Go";
    numSort = edat % 2 + 23;
  }
  public void Desembre() {
    equipFutbol="Manchester United";
    llenguatgeProgramacio="Ruby";
    numSort = (edat + edat) / 2;
  }
}