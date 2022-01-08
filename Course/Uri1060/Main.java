import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double num;
		
		int cont = 0;

		for (int i = 0; i < 6; i++) {
			
			num = sc.nextDouble();
			
			if (num > 0) {
				
				cont += 1;
				
			}

		}
		System.out.println(cont + " valores positivos");

		sc.close();

	}

}
