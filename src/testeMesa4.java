import java.util.Locale;
import java.util.Scanner;

public class testeMesa4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite dois números: ");
		Double A = sc.nextDouble();
		Double B = sc.nextDouble();
		
		while ( A!=0 && B!=0) 	{
			if (A < B) {
				System.out.println("Menor = " +A);
			} else {
				System.out.println("Menor = " +B);
			}
			
			System.out.print("Digite dois números: ");
			A = sc.nextDouble();
			B = sc.nextDouble();
						
		}

	}

}
