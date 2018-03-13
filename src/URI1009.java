import java.util.Locale;
import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	String FN = sc.next();
	double SFIXO = sc.nextDouble();
	double TVENDAS = sc.nextDouble();
	double TOTAL = SFIXO + (0.15 * TVENDAS);
	
	System.out.printf("TOTAL = R$ %.2f\n",TOTAL);
	
	sc.close();
			
			
	}

}