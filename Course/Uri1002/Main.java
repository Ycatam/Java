import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double pi = 3.14159;
		double R = sc.nextDouble();
		
		double A = pi * Math.pow(R, 2);
		
		System.out.printf("A=%.4f%n", A);
		
		sc.close();

	}

}
