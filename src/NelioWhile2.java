import java.util.Scanner;

public class NelioWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int pessoas = 0;
		double somaIdades = 0;
				
		while (idade > 0) {
			pessoas = pessoas +1;
			somaIdades = somaIdades + idade;
				
			idade = sc.nextInt();
							
			}
		
		if (pessoas == 0) {
			System.out.println("impossivel calcular");
		} else {
			
			double media = somaIdades/pessoas;
			System.out.printf("%.2f\n", media);
		
		}
		
	}

}
