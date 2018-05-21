import java.util.Scanner;

public class URI1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			int soma = 0;
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (x % 2 == 0) {
				x += 1;

				for (int ii = y; y != 0; y--) {
					soma += x;
					x += 2;
				}

			} 

			if (x % 2 !=0 ) {

				for (int ii = y; y != 0; y--) {
					soma += x;
					x += 2;

				}
			}

			System.out.println(soma);

		}
	}

}
