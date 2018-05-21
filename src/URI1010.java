import java.util.Locale;
import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int CODIGO1, PECAS1;
		int CODIGO2, PECAS2;
		double VALOR1, VALOR2, VALOR;

		CODIGO1 = input.nextInt();
		PECAS1 = input.nextInt();
		VALOR1 = input.nextDouble();
		CODIGO2 = input.nextInt();
		PECAS2 = input.nextInt();
		VALOR2 = input.nextDouble();

		VALOR = PECAS1 * VALOR1 + PECAS2 * VALOR2;

		System.out.printf("VALOR A PAGAR: R$ %.2f\n",VALOR);

    }
}