import java.util.Locale;
import java.util.Scanner;

public class testeMesa1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
	
		double media = (A+B+C)/3;
		
		if (media >= 7) {
			System.out.println("MEDIA = "+media);
			System.out.println("Aprovado");
		} 
		
		if (media >=4 && media < 7) {
			System.out.printf("MEDIA = %.1f\n",media);
			System.out.println("Exame");
			System.out.printf("Faltaram %.1f\n",(7-media));
		} else {
			System.out.printf("MEDIA = %.1f\n",media);
			System.out.println("Reprovado");
			System.out.printf("Faltaram %.1f\n",(7-media));
		}
		
		

	}

}
