import java.util.Scanner;

public class codepita2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			long x = sc.nextInt();
			long soma = 0;
			
			for (long xvar = 1; xvar < x; xvar++) {
				
				if (x%xvar == 0) {
					soma+=xvar;
				}
								
			}
			
			if (soma == x) {
				System.out.println(x +" eh perfeito");
			} else {
				System.out.println(x +" nao eh perfeito");
			}
			
		}

	}

}
