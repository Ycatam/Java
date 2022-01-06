import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		
		float pondavg1 = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1);
		
		
		if (pondavg1 > 7.0) {
			
			System.out.printf("Media: %.1f%n", pondavg1);
			System.out.println("Aluno aprovado.");
			
		}
		
		else if (pondavg1 >= 5.0 && pondavg1 <= 6.9) {
			
			System.out.printf("Media: %.1f%n", pondavg1);
			System.out.println("Aluno em exame.");
			float exam = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", exam);
			float avg1 = (float) (pondavg1 + exam) / 2;
			System.out.println("Aluno aprovado.");
			System.out.printf("Media final: %.1f%n", avg1);
			
		}

		else {
			
			System.out.printf("Media: %.1f%n", pondavg1);
			System.out.println("Aluno reprovado.");
			
		}
		
		sc.close();
	}

}
