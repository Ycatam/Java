import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double p1 = 2;
		double p2 = 3;
		double p3 = 5;
		
		double MEDIA = ((A * p1) + (B * p2) + (C * p3)) / (p1 + p2 + p3);
		
		System.out.printf("MEDIA = %.1f%n", MEDIA);
		
		
		sc.close();

	}

}
