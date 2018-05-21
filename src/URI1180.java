import java.util.Scanner;

public class URI1180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int menor = 1001;
		int posicao = 0;
		
		while (N > 0 ) {
			int x = sc.nextInt();
			if (x < menor) {
				menor = x;
			}
			
			
		N--;
		
		}
		
		System.out.println("Menor valor: "+menor);
		System.out.println("Posicao: "+posicao);
		
	}

}
