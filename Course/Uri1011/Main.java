import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R = sc.nextDouble();
		double pi = 3.14159;
		
		double volume = pi * Math.pow(R, 3) * (4/3.0);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();

	}

}
