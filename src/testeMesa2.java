import java.util.Locale;
import java.util.Scanner;

public class testeMesa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		double rendaMes = sc.nextDouble();
		double valor = sc.nextDouble();
		double entrada = 0;
		double prestacao = 0;
		
		if (rendaMes <= 1000.00) {
			entrada = valor*0.6;
			prestacao = (valor - entrada)/12;
			
			System.out.printf("ENTRADA = R$ %.2f\n",entrada);
			System.out.printf("PRESTACAO = R$ %.2f\n",prestacao);
			
		} else if (rendaMes > 1000.00 && rendaMes <= 2000.00) {
			entrada = valor*0.4;
			prestacao = (valor - entrada)/24;
			
			System.out.printf("ENTRADA = R$ %.2f\n",entrada);
			System.out.printf("PRESTACAO = R$ %.2f\n",prestacao);
		
		} else if (rendaMes > 2000.00 && rendaMes <= 5000.00) {
			entrada = valor*0.2;
			prestacao = (valor - entrada)/36;
			
			System.out.printf("ENTRADA = R$ %.2f\n",entrada);
			System.out.printf("PRESTACAO = R$ %.2f\n",prestacao);
		
		} else {
			entrada = valor*0.1;
			prestacao = (valor - entrada)/48;
			
			System.out.printf("ENTRADA = R$ %.2f\n",entrada);
			System.out.printf("PRESTACAO = R$ %.2f\n",prestacao);
		}

		sc.close();
	}

}
