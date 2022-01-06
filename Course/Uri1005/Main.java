import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double p1 = 3.5;
		double p2 = 7.5;
		
		
		double MEDIA = ((A * p1) + (B * p2)) / (p1 + p2);
		
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		
		
		sc.close();

	}

}
