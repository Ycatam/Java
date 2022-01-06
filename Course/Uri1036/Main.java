import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4.0 * a * c;
		
		if (a == 0 || delta < 0.0) {
			System.out.println("Impossivel calcular");
		}
		
		else {
			double r1 = (-b + Math.sqrt(delta)) / (2 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1, r2);
		}
		
		
		sc.close();
	}

}
