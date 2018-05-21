import java.util.Locale;
import java.util.Scanner;

public class testeMesa3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Já possui carteira (S/N)? ");
		String c = sc.nextLine();

		char p = c.charAt(0);

		if (p == 's' || p == 'S') {

			System.out.print("Resultado do exame psicotécnico: ");
			double psico = sc.nextDouble();

			if (psico >= 8) {
				System.out.println("APROVADO");
			} else {
				System.out.println("REPROVADO");
			}

		} else {

			System.out.print("Resultado do exame legislação: ");
			double leg = sc.nextDouble();

			System.out.print("Resultado do exame psicotécnico: ");
			double psico = sc.nextDouble();

			System.out.print("Resultado do exame de direção: ");
			double dir = sc.nextDouble();

			if (psico >= 8 && leg >= 6 && dir >= 7) {
				System.out.println("APROVADO");
			} else {
				System.out.println("REPROVADO");
			}

		}

	}

}
