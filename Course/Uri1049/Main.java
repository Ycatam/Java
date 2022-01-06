import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String type = sc.nextLine();
		String kind = sc.nextLine();
		String food = sc.nextLine();
// Remainder: In Java, since Strings are objects, never use == for comparison.
// use string.equals instead. Otherwise, comparison won't work.
// because == will compare address in memory, because of string pooling in Java.
		if (type.equals("vertebrado")) {

			if (kind.equals("ave")) {

				if (food.equals("carnivoro")) {

					System.out.println("aguia");

				}

				else {

					System.out.println("pomba");

				}
			}

			else {

				if (food.equals("onivoro")) {

					System.out.println("homem");

				}

				else {

					System.out.println("vaca");

				}

			}

		}

		else {

			if (kind.equals("inseto")) {

				if (food.equals("hematofago")) {

					System.out.println("pulga");

				}

				else {

					System.out.println("lagarta");

				}
			}

			else {

				if (food.equals("hematofago")) {

					System.out.println("sanguessuga");

				}

				else {

					System.out.println("minhoca");

				}

			}

		}

		sc.close();
	}

}
