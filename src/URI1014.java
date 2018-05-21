import java.util.Scanner;
import java.text.DecimalFormat;

public class URI1014 {
    public static void main(String[] args)  {
 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		int X;
		double Y, consumo;

		X = input.nextInt();
		Y = input.nextDouble();

		consumo = X / Y;

		System.out.println(df.format(consumo) + " km/l");

    }
}
