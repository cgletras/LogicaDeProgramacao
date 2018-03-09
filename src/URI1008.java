import java.util.Scanner;

public class URI1008 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int NUMBER = sc.nextInt();
		int HOURS = sc.nextInt();
		double SalaryPerHour = sc.nextDouble();
		double TotalSalary = HOURS*SalaryPerHour;
		
		System.out.println("NUMBER = "+ NUMBER);
		System.out.printf("SALARY = U$ %.2f\n", TotalSalary);
		
		sc.close();
	}
	
}