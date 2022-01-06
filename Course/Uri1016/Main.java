import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int dist = X * 2;
		
		System.out.printf("%d minutos%n", dist);
		
		sc.close();

	}

}
