import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		float A, B, C;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		if((A < B + C) && (B < A + C) && (C < A + B)) {
			
			float perimeter = A + B + C;
			System.out.printf("Perimetro = %.1f%n", perimeter);
			
		}
		
		else {
			
			float areaTrap = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f%n", areaTrap);
		}
		
		sc.close();

	}

}
