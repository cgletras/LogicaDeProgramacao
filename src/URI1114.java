import java.util.Scanner;

public class URI1114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		int pass = sc.nextInt();
		
		while (senha != pass) {
			System.out.println("Senha Invalida");
			
			pass = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		sc.close();
	}

}
