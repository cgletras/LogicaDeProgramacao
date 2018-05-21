import java.util.Scanner;

public class URI1329 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = 0;
		int J = 0;
		
		while (N > 0) {
		
			int x = sc.nextInt();
			
			if (x == 0) {
				M++;
			} else {
				J++;
			}
			N--;
		}
		System.out.println("Mary won "+M+" times and John won "+J+" times");
		N = sc.nextInt();
		
				
	}
}


