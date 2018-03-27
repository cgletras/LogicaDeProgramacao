import java.util.Locale;
import java.util.Scanner;

public class URI1072 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	
	int xin = 0;
	int xout = 0;
	
	while (N != 0) {
		int x = sc.nextInt();
		
		if (x >= 10 & x <=20) {
			xin = xin + 1;
		} else xout = xout + 1;
		
	N = N-1;
		
	}
	
	
	System.out.println(xin+" in");
	System.out.println(xout+" out");

	sc.close();
	
	}

}
