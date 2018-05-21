import java.util.Locale;
import java.util.Scanner;

public class URI1012 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double A = sc.nextDouble();
	double B = sc.nextDouble();
	double C = sc.nextDouble();
	double pi = 3.14159;
	
	double TRIANGULO = A * C * 0.5; 
	double CIRCULO = pi * C * C;
	double TRAPEZIO = (A + B) * C * 0.5; 
	double QUADRADO = B * B; 
	double RETANGULO = A * B;
	
	System.out.printf("TRIANGULO: %.3f\n",TRIANGULO);
	System.out.printf("CIRCULO: %.3f\n",CIRCULO);
	System.out.printf("TRAPEZIO: %.3f\n",TRAPEZIO);
	System.out.printf("QUADRADO: %.3f\n",QUADRADO);
	System.out.printf("RETANGULO: %.3f\n",RETANGULO);
	
	sc.close();
	
	}

}
