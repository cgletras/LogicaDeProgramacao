import java.util.Scanner;

public class prova4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String senha = sc.nextLine();
		int pos = 0;
		char check = senha.charAt(pos);
		
		while (check!='0')	{
			
			int valida = 0;
			
			for (int i = pos; i < senha.length(); i++) {
				
				char c = senha.charAt(i);
				
				if (c != ' ') {
					valida+=0;
					
				} else 
					valida+=1;
				
				if (senha.length() < 6 || senha.length() > 32) {
					valida+=1;
				}
				
				if (c > 'a' && c < 'z') {
					valida+=0;
				}
			}
			
			if (valida == 0) {
				System.out.println("Senha Valida");
			} else {
				System.out.println("Senha Invalida");
			}
						
		senha = sc.nextLine();
		pos = pos * 0;
		check = senha.charAt(pos);	
		}
		
	}

}
