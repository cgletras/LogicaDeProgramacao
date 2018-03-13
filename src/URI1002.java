import java.util.Locale;
import java.util.Scanner;
public class URI1002 {
	
	public static void main(String args []) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
	double R = sc.nextDouble();
	double Pi = 3.14159;
	double A = Pi * (R * R);
	
	System.out.printf("A=%.4f\n",A);
	
	sc.close();			
		
	}
		
}
