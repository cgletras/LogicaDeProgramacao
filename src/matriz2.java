import java.util.Locale;
import java.util.Scanner;

public class matriz2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double [][] mat = new double [N][N];
		
		double somaPos = 0;
		
		for (int i = 0; i < N; i++) {
			
			for (int j = 0; j < N; j++) {
				
				mat [i][j] = sc.nextDouble();
				
/*a*/			if (mat [i][j] > 0) {
					somaPos += mat [i][j];
				}
			}
		}
		
		int L = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println("SOMA DOS POSITIVOS: "+ somaPos);
		
/*b*/		System.out.print("LINHA ESCOLHIDA: ");

			for (int j = 0; j < N; j++) {
					
				System.out.print(mat [L][j] + " ");
			}
				System.out.println();
			

/*c*/		System.out.print("COLUNA ESCOLHIDA: ");
			
			for (int i = 0; i < N; i++) {
			
				System.out.print(mat [i][C] + " ");
			}
				System.out.println();
		
/*d*/		System.out.print("DIAGONAL PRINCIPAL: ");
			
			for (int i = 0; i < N; i++) {
				
				System.out.print(mat [i][i] + " ");
			}
				System.out.println();
		
/*e*/		System.out.println("MATRIZ ALTERADA:");				
		
			for (int i = 0; i < N; i++) {
				
				for (int j = 0; j < N; j++) {
									
					if (mat [i][j] >= 0) {
						System.out.print(mat [i][j]+" ");
					} else {
						System.out.print((mat [i][j] * mat [i][j])+ " ");
					}
				}
			System.out.println();
			}

		sc.close();
	}

}
