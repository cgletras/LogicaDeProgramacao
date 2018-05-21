import java.util.Locale;
import java.util.Scanner;

public class matriz3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int [][] mat1 = new int [M][N];
		int [][] mat2 = new int [M][N];
		int [][] matS = new int [M][N];
		
		for (int i = 0; i < M; i++) {
			
			for (int j = 0; j < N; j++) {
				
				mat1 [i][j] = sc.nextInt();
				matS [i][j] += mat1 [i][j];
			}
		}
		
		for (int i = 0; i < M; i++) {
			
			for (int j = 0; j < N; j++) {
				
				mat2 [i][j] = sc.nextInt();
				matS [i][j] += mat2 [i][j];
			}
		}
				
		for (int i = 0; i < M; i++) {
			
			for (int j = 0; j < N; j++) {
				
				System.out.print(matS [i][j] + " ");
			}
			System.out.println();
		}
					
		sc.close();
	}

}
