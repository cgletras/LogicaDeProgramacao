import java.util.Locale;
import java.util.Scanner;

public class URI1011 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	double R = sc.nextDouble();
	double VOLUME = (4.0/3) * 3.14159 * (R*R*R);
	
	System.out.printf("VOLUME = %.3f\n",VOLUME);
	
	sc.close();
	}

}
