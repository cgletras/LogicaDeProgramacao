import java.util.Scanner;

public class URI1101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		while (N > 0 || M > 0) {
			
			if (M == N) {
				System.out.println("Sum=0");
			
			} else if (M > N) {
							
				while (M >= N) {
					sum = sum + N;
					N++;
				System.out.print(N+" ");
				}
				System.out.println("Sum="+sum);
			
			} else {
								
				while (N >= M) {
					sum = sum + M;
					M++;
				System.out.print(M+" ");
				}
				System.out.println("Sum="+sum);
			}
			
			
		}
	}
}
