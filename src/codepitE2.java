import java.util.Scanner;

public class codepitE2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int pos = 0;
		int menor = 21;
		int posmenor = 0;
		for (int i = 0; i < N; i++) {
			
			pos+=1;
			
			int T = sc.nextInt();
			if (T < menor) {
				menor = T;
				posmenor = pos;
			}
			
		}
		System.out.println(posmenor);

	}

}
