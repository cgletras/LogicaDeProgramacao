import java.util.Locale;
import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int F = sc.nextInt();
	int HT = sc.nextInt();
	double VH = sc.nextDouble();
	double SALARY = HT * VH;
	
	System.out.println("NUMBER = "+F);
	System.out.printf("SALARY = U$ %.2f\n", SALARY);
	
	sc.close();
	
	}

}
