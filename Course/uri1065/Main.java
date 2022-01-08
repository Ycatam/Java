import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		
		int cont = 0;

		for (int i = 0; i < 5; i++) {
			
			num = sc.nextInt();
			
			if (num % 2 == 0) {
				
				cont += 1;
				
			}

		}
		System.out.println(cont + " valores pares");

		sc.close();

	}

}
