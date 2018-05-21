import java.util.Scanner;

public class matriz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int [][] mat = new int [N][N];
		int [] vet = new int [N];
		
		for (int i = 0; i < N; i++) {
			
			int somaLinha = 0;
			
			for (int j = 0; j < N; j++) {
				
				mat [i][j] = sc.nextInt();
				somaLinha+= mat [i][j];
			}
			
			vet [i]+= somaLinha;
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(" "+ vet[i]);	
		}
		
		sc.close();
	}

}
