import java.util.Locale;
import java.util.Scanner;

public class URI1016 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int km =sc.nextInt();
		int tempo = km * 2;
		
		System.out.println(tempo + " minutos");
		sc.close();

	}

}
