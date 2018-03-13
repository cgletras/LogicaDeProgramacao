import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class URI1012 {

	public static void main(String[] args) throws IOException {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.000");
	
	double A = sc.nextDouble();
	double B = sc.nextDouble();
	double C = sc.nextDouble();
	double pi = 3.14159;
	
	double TRIANGULO = A * C * 0.5; 
	double CIRCULO = pi * C * C;
	double TRAPEZIO = (A + B) * C * 0.5; 
	double QUADRADO = B * B; 
	double RETANGULO = A * B;
	
	System.out.println("TRAINGULO: " + df.format(TRIANGULO));
	System.out.println("CIRCULO: " + df.format(CIRCULO));
	System.out.println("TRAPEZIO: " + df.format(TRAPEZIO));
	System.out.println("QUADRADO: " + df.format(QUADRADO));
	System.out.println("RETANGULO: " + df.format(RETANGULO));
	
	sc.close();
	
	}

}
