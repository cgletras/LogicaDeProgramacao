import java.util.Locale;
import java.util.Scanner;

public class matriz6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int [][] mat = new int [M][N];
				
		for (int i = 0; i < M; i++) {
			
			for (int j = 0; j < N; j++) {
				
				mat [i][j] = sc.nextInt();
								
			}
		
		}
		
		int gf = sc.nextInt();
		
		
		sc.close();
	}

}
