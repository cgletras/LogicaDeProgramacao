import java.util.Scanner;

public class codepitC2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String letras = sc.nextLine();
		String palavra = "";
		int N = sc.nextInt();
				
		for (int i = 0; i < N;  i ++) {
		
			int posLetra = sc.nextInt();
			
			palavra += letras.charAt(posLetra-1);
					
		}
		System.out.println(palavra);
	}

}
