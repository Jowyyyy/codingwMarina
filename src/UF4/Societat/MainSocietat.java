package UF4.Societat;

import UF4.Persona.Persona;

public class MainSocietat {
      public static void main(String[] args) {
            Persona p1 = new Persona();
            p1.setDni("2345443J");
            p1.setNom("joel");
            p1.setEdat(20);
            Persona p2 = new Persona("6788655567j","Joel",20);
            Persona p3 = new Persona("77865756467","Joel");
            Persona p4 = new Persona("6785475675P");
            Persona p5 = new Persona(20);
            Persona p6 = new Persona(20,"Jowy");
            Persona p7 = new Persona("8678678755H","Jowww");

            p1.visualitzar();
            p2.visualitzar();
            p3.visualitzar();
            p4.visualitzar();
            p5.visualitzar();
            p6.visualitzar();
            p7.visualitzar();

      }
}
