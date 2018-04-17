import java.util.Scanner;

public class codepitb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		while (M > 0 && N > 0) {
			
			int somaparc = M + N;
			String somafinal = "";
			
			somafinal+=somaparc;
			
			for (int i = somafinal.length(); i!=0;i--) {
				
				char zero = somafinal.charAt(i);
				
				if (zero == 0) {
					
				//NÂO CONSEGUI REMOVER UM "CHAR" DE UMA STRING
				
				}
			}
						
			System.out.println(somafinal);
			M = sc.nextInt();
			N = sc.nextInt();
		}
		
		sc.close();
	}

}
