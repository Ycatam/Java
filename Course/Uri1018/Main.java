import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int notacem = N / 100;
		int restocem = N % 100;
		int notacinq = restocem / 50;
		int restocinq = restocem % 50;
		int notavinte = restocinq / 20;
		int restovinte = restocinq % 20;
		int notadez = restovinte / 10;
		int restodez = restovinte % 10;
		int notacinco = restodez / 5;
		int restocinco = restodez % 5;
		int notadois = restocinco / 2;
		int restodois = restocinco % 2;
		int notaum = restodois / 1;
		
		System.out.printf("%d%n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n", N, notacem, notacinq, notavinte, notadez, notacinco, notadois, notaum);
		
		sc.close();

	}

}
