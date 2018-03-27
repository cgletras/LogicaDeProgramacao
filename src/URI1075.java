import java.util.Locale;
import java.util.Scanner;

public class URI1075 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
	int N = sc.nextInt();
	int i = 1;
	
	while (i<=10000) {
		
		if (i % N == 2) {
			System.out.println(i);
			}
		
		i = i+1;
		
		}
		

	}

}
