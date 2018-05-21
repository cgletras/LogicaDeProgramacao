import java.util.Scanner;

public class URI1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		
		while (N > 0) {
		System.out.println(n1+" "+n2+" "+n3+" PUM");	
			
			n1+=4;
			n2+=4;
			n3+=4;
			N--;
		}

	}

}
