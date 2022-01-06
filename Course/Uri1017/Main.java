import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int speed = sc.nextInt();
		
		double liters = time * speed;
		double literst = liters / 12; 
				
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", literst);
		
		sc.close();

	}

}
