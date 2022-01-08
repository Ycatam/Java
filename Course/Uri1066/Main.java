import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		int contEven = 0, contOdd = 0, contPos = 0, contNeg = 0;

		for (int i = 0; i < 5; i++) {

			num = sc.nextInt();

			if (num == 0) {

				contEven += 1;

			}

			else {

				if (num % 2 == 0) {

					if (num > 0) {

						contEven += 1;
						contPos += 1;

					}

					else {

						contEven += 1;
						contNeg += 1;

					}
				}

				else {

					if (num < 0) {

						contOdd += 1;
						contNeg += 1;

					}

					else {

						contOdd += 1;
						contPos += 1;
					}

				}
			}

		}
		System.out.println(contEven + " valor(es) par(es)");
		System.out.println(contOdd + " valor(es) impar(es)");
		System.out.println(contPos + " valor(es) positivo(s)");
		System.out.println(contNeg + " valor(es) negativo(s)");
		sc.close();

	}

}
