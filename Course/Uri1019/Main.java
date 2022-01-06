import java.util.Scanner;
import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int horas = N / 3600;
		int resto = N % 3600;
		int minutos = resto / 60;
		int segundos = resto % 60;
		
		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
		
		sc.close();

	}

}
