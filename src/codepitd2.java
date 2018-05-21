import java.util.Locale;
import java.util.Scanner;

public class codepitd2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota = sc.nextDouble();
		int valida = 0;
		double soma = 0;
		
		while (valida < 2) {
					
			if (nota >= 0 && nota <= 10) {
				valida+=1;
				soma+=nota;
			} else {
				System.out.println("nota invalida");
			}
					
			if (valida < 2) {
				nota = sc.nextDouble();
			}
		}
		
		System.out.printf("media = %.2f\n",soma/2);

	}

}
