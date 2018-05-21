import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		int H = sc.nextInt();
		int KMH = sc.nextInt();
		double KML = 12;
		double GAS = ((H * KMH)/KML);
		
		System.out.println(df.format(GAS));
		
		sc.close();
		
		

	}

}
