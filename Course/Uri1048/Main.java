import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double p1 = 0.15, p2 = 0.12, p3 = 0.1, p4 = 0.07, p5 = 0.04;
		double salary = sc.nextDouble();
		double newSalary = 0;
		
		if (salary <= 400.00) {
			
			double riseAmount = salary * p1;
			newSalary = salary + riseAmount;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %.0f %%%n", newSalary, riseAmount, (p1 * 100));
			
		}
		
		else if (salary > 400.00 && salary <= 800.00) {
			
			double riseAmount = salary * p2;
			newSalary = salary + riseAmount;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %.0f %%%n", newSalary, riseAmount, (p2 * 100));
			
		}
		
		else if (salary > 800.00 && salary <= 1200.00) {
			
			double riseAmount = salary * p3;
			newSalary = salary + riseAmount;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %.0f %%%n", newSalary, riseAmount, (p3 * 100));
			
		}
		
		else if (salary > 1200.00 && salary <= 2000.00) {
			
			double riseAmount = salary * p4;
			newSalary = salary + riseAmount;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %.0f %%%n", newSalary, riseAmount, (p4 * 100));
			
		}
		
		else {
			
			double riseAmount = salary * p5;
			newSalary = salary + riseAmount;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %.0f %%%n", newSalary, riseAmount, (p5 * 100));
			
		}
		
		sc.close();
		
	}

}
