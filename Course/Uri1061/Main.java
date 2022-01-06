import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int diaUm = sc.nextInt();
		int horaUm = sc.nextInt();
		s = sc.next();
		int minutoUm = sc.nextInt();
		s = sc.next();
		int segundoUm = sc.nextInt();
		s = sc.next();
		int diaDois = sc.nextInt();
		int horaDois = sc.nextInt();
		s = sc.next();
		int minutoDois = sc.nextInt();
		s = sc.next();
		int segundoDois = sc.nextInt();
		
		int totalInicio1 = (diaUm *24*60*60) + (horaUm *60 *60) + (minutoUm *60) + segundoUm;
		int totalInicio2 = (diaDois *24*60*60) + (horaDois *60 *60) + (minutoDois *60) + segundoDois;
		
		int total = totalInicio2 - totalInicio1;
		
		int dias = total / (24 * 60 * 60);
		int resto = total % (24 * 60 * 60);
		int horas = resto / (60 * 60);
		resto = resto % (60 * 60);
		int minutos = resto / 60;
		int segundos = resto % 60;
		
		System.out.printf("%d dia(s)\n%d hora(s)\n%d minuto(s)\n%d segundo(s)\n", dias, horas, minutos, segundos);
		
		sc.close();

	}

}
