import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.0000");
		Scanner sc = new Scanner(System.in);
		
		double x1 =sc.nextDouble();
		double y1 =sc.nextDouble();
		double x2 =sc.nextDouble();
		double y2 =sc.nextDouble();
		
		double distancia = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
		
		System.out.println(df.format(distancia));
		sc.close();

	}

}
