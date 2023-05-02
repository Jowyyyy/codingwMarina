/*package UF2.MaximaMitjana;
public class MitjanaMaxima {
  public static void main(String[] args) {
    MitjanaMaxima programa = new MitjanaMaxima();
    programa.inici();
  }
  public void inici() {


    //Per cridar els m todes cal inicialitzar la classe que els cont 
     CalculaArrayReals calculador = new CalculaArrayReals();
    //Un cop fet, cal cridar−los usant com a prefix l’identificador
    double[] arrayA = new double[6];
    arrayA = calculador.LeerArray(arrayA);
    double[] arrayB = new double[6];
    arrayB = calculador.LeerArray(arrayB);

    double mitjA=calculador.CalculaM(arrayA);
    double mitjB=calculador.CalculaM(arrayB);

    if (arrayA > arrayB) {
      System.out.println("arrayA té una mitjana més alta.");
    }
    else if (arrayA < arrayB) {
      System.out.println("arrayB té una mitjana més alta.");
    }
    else {
      System.out.println("Les dues mitjanes són iguals!");
    }
  }
}

 */