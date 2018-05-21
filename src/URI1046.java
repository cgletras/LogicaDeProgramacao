import java.util.Scanner;

public class URI1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		
		if (h1 == h2) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}

		if (h1 < h2) {
			System.out.println("O JOGO DUROU "+(h2-h1)+" HORA(S)");
		}
		
		if (h1 > h2) {
			int d1 = (24-h1) + h2;
			System.out.println("O JOGO DUROU "+d1+" HORA(S)");
		}
	}

}
