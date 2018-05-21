import java.util.Scanner;

public class codepitb2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			long x = sc.nextInt();
			long soma = 0;
			
			for (long xvar = 1; xvar <= x; xvar++) {
				
				if (x%xvar == 0) {
					soma+=xvar;
				}
								
			}
			
			if (soma == x+1) {
				System.out.println(x +" eh primo");
			} else {
				System.out.println(x +" nao eh primo");
			}
			
		}

	}

}
