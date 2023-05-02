package UF2.MitjanaMaxima.Recursivitat;
public class Recursivitat {
	public static void main(String args[]) {
		sum(33);
	}
	public static int sum(int x) {
		if (x == 0) {
			System.out.println("El nombre 0 és parell");
		} else if (x % 2 > 0) {
			System.out.println("El nombre " + x + " és senar");
			return x + sum(x - 1);
		} else {
			System.out.println("El nombre " + x + " és parell");
			return x + sum(x - 1);
		}
		return 0;
	}
}
