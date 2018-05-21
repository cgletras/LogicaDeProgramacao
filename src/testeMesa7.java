import java.util.Locale;
import java.util.Scanner;

public class testeMesa7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();

		while (A != 0 && B != 0) {
			if (A < B) {
				System.out.println("PRIMEIRO");
			} else if (A == B) {
				System.out.println("IGUAIS");
			} else {
				System.out.println("SEGUNDO");
			}

			A = sc.nextDouble();
			B = sc.nextDouble();
		}

		sc.close();
	}

}
