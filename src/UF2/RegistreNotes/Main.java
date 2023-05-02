package UF2.RegistreNotes;
public class Main {
    public static void main(String[] args) {
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        CalcularMaxim jpp = new CalcularMaxim();
        CalcularMinim jpp2 = new CalcularMinim();
        CalcularMitjana jpp3 = new CalcularMitjana();
        double max = jpp.CalcularMaxim(notes);
        double min = jpp2.calcularMinim(notes);
        double mitjana = jpp3.calcularMitjana(notes);
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }
}