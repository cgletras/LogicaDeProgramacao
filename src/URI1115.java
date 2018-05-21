import java.util.Scanner;

public class URI1115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int y = sc.nextInt();
		int x = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("PRIMEIRO");
			} else	if (x > 0 && y < 0) {
				System.out.println("SEGUNDO");
			} else if (x < 0 && y < 0) {
				System.out.println("TERCEIRO");
			} else if (x < 0 && y > 0){
				System.out.println("QUARTO");
			}
		
		x = sc.nextInt();
		y = sc.nextInt();
		}
		
	}

}
