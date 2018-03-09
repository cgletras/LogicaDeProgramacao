import java.util.Scanner;
import java.util.Locale;

public class URI1009 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner (System.in);
		
		String firstName = sc.next();
		double salary = sc.nextDouble();
		double sales = sc.nextDouble();
		double TOTAL = salary + sales * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
		
		sc.close();
	}
}
