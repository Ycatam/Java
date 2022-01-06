import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		double Y = sc.nextDouble();
		
		double km = X/Y;
		
		System.out.printf("%.3f km/l%n",km );
		
		sc.close();

	}

}
