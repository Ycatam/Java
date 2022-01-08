import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salary = sc.nextDouble();
		
		if (salary > 0.00 && salary <= 2000.00) {
			
			System.out.println("Isento");
			
		}
		
		else {
			
			if (salary > 2000.00 && salary <= 3000.00 ) {
				
				double tax = (salary - 2000.00) * 0.08;
				System.out.printf("R$ %.2f%n", tax);
			}
			
			else if (salary > 3000.00 && salary <= 4500.00 ) {
				
				double tax = ((salary - 3000.00) * 0.18) + (1000 * 0.08) ;
				System.out.printf("R$ %.2f%n", tax);
			}
			
			else {
				
				double tax = ((salary - 4500) * 0.28) + (1000 * 0.08) + (1500 * 0.18);				
				System.out.printf("R$ %.2f%n", tax);
			}
			
		}
		
		sc.close();

	}

}
