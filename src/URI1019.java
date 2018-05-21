import java.util.Locale;
import java.util.Scanner;

public class URI1019 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int H = N/3600;
		int M = (N%3600)/60;
		int S = (N%3600)%60;
		
		System.out.println(H+":"+M+":"+S);
	
		sc.close();
	}

}
