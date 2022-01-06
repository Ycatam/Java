import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X, Y, Z, min1 = 0, min2 = 0, min3 = 0;

		X = sc.nextInt();
		Y = sc.nextInt();
		Z = sc.nextInt();

		min1 = Math.min(X, Math.min(Y, Z));
		
		if (min1 == X) {
			
			min2 = Math.min(Y, Z);
			min3 = Math.max(Y, Z);
			
		}
		
		if (min1 == Y) {
			
			min2 = Math.min(X, Z);
			min3 = Math.max(X, Z);
			
		}
		
		if (min1 == Z) {
			
			min2 = Math.min(X, Y);
			min3 = Math.max(X, Y);
			
		}
		
		System.out.println(min1 + "\n" + min2 + "\n" + min3 + "\n");
		System.out.println(X + "\n" + Y + "\n" + Z);

		sc.close();

		// method with Arrays.sort, default from Java. Print comes with [ sorted array ]
		// comma separated.
		/*
		 * int[] array = new int [3];
		 * 
		 * for (int i = 0; i <3; i++) {
		 * 
		 * array[i] = sc.nextInt();
		 * 
		 * }
		 * 
		 * Arrays.sort(array);
		 * 
		 * System.out.println(Arrays.toString(array));
		 */

	}

}
