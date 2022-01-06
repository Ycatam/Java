import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int code1 = sc.nextInt();
		int prod1 = sc.nextInt();
		double price1 = sc.nextDouble();
		int code2 = sc.nextInt();
		int prod2 = sc.nextInt();
		double price2 = sc.nextDouble();
		
		double valor = (prod1 * price1) + (prod2 * price2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
		
		sc.close();

	}

}
