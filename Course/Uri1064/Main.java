import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double num = 0, media = 0;
		
		int cont = 0;
		double sum = 0;
		
		for (int i = 0; i < 6; i++) {
			
			num = sc.nextDouble();
			
			if (num > 0) {
				
				cont += 1;
				sum += num;
				
			}
			
			
		}
		
		media = sum / cont;
		System.out.printf("%d valores positivos%n%.1f%n", cont, media);

		sc.close();

	}

}
