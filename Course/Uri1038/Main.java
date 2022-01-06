import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		double price;
		
		if (X == 1) {
			
			price = (double) Y * 4.0;
						
		}
		
		else if (X == 2) {
			
			price = (double) Y * 4.5;
						
		}
		
		else if (X == 3) {
			
			price = (double) Y * 5.0;
						
		}
		
		else if (X == 4) {
			
			price = (double) Y * 2.0;
			
		}
		
		else {
			
			price = (double) Y * 1.5;
						
		}
		
		System.out.printf("Total: R$ %.2f%n", price);
		
		sc.close();
	}

}
