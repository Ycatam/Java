import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ano = N / 365;
		int restoAno = N % 365;
		int mes = restoAno / 30;
		int dias = restoAno % 30;
				
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dias);
		
		sc.close();
		

	}

}
