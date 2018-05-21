import java.util.Locale;
import java.util.Scanner;

public class testeMesa8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double soma = 0;
		for (int i = 1; i <= N; i++) {
			
			double preco = sc.nextDouble();
			
			if (preco < 1000.00) {
				soma+= preco;
			}
						
		}
		System.out.printf("%.2f\n",soma);
	}

}
