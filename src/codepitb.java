import java.util.Scanner;

public class codepitb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		while (M > 0 && N > 0) {
			
			int soma = M + N;
			String somaS = soma+"";
			String somafinal = "";
			
			for (int i = 0; i < somaS.length(); i++) {
				
				if (somaS.charAt(i) != '0') {
					somafinal+= somaS.charAt(i);
				}
				
				
			}
			System.out.println(somafinal);
			M = sc.nextInt();
			N = sc.nextInt();
			
		}
		
	}

}
