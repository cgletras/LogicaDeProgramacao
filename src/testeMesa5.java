import java.util.Locale;
import java.util.Scanner;

public class testeMesa5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores você vai digitar: ");
		int N = sc.nextInt();
		double soma = 0;
		int M = 0;	
		
		for (int i=1; i<= N; i++) {
			System.out.print("Digite o "+i+"@ numero :");
			double X = sc.nextDouble();
			
			if (X > 0) {
				soma+=X;
				M+=1;
			}
			
		}
		
		System.out.println("Média dos positivos = "+(soma/M));
	}

}
