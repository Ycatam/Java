import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;
		
		double triangle = (A*C)/2.0;
		double circle = pi* Math.pow(C, 2);
		double trapezium = ((A + B)*C)/2;
		double square = Math.pow(B, 2);
		double rect = A * B;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", triangle, circle, trapezium, square, rect);
		
		sc.close();

	}

}
