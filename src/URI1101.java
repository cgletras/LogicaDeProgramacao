import java.util.Scanner;

public class URI1101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		
		while (N > 0 && M > 0) {
			int sum = 0;	
			if (M > N) {
				while (M >= N) {
				sum = sum + N;
					
				System.out.print(N+" ");
				N++;
			}
				System.out.println("Sum="+sum);
							
			} else {
				while (N >= M) {
				sum = sum + M;
					
				System.out.print(M+" ");
				M++;
			}
				System.out.println("Sum="+sum);
			}
			
			M = sc.nextInt();
			N = sc.nextInt();
		}
	}
}
