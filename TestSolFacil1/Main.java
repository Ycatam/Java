import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				
//only works to 21th century
		
		int x = 1;
		while (x != 0) {
			
			x = sc.nextInt();
			
			if (x >= 1 && x <= 100) System.out.println("1");
			else if (x > 100 && x <= 200) System.out.println("2");
			else if (x > 200 && x <= 300) System.out.println("3");
			else if (x > 300 && x <= 400) System.out.println("4");
			else if (x > 400 && x <= 500) System.out.println("5");
			else if (x > 500 && x <= 600) System.out.println("6");
			else if (x > 600 && x <= 700) System.out.println("7");
			else if (x > 700 && x <= 800) System.out.println("8");
			else if (x > 800 && x <= 900) System.out.println("9");
			else if (x > 900 && x <= 1000) System.out.println("10");
			else if (x > 1000 && x <= 1100) System.out.println("11");
			else if (x > 1100 && x <= 1200) System.out.println("12");
			else if (x > 1200 && x <= 1300) System.out.println("13");
			else if (x > 1300 && x <= 1400) System.out.println("14");
			else if (x > 1400 && x <= 1500) System.out.println("15");
			else if (x > 1500 && x <= 1600) System.out.println("16");
			else if (x > 1600 && x <= 1700) System.out.println("17");
			else if (x > 1700 && x <= 1800) System.out.println("18");
			else if (x > 1800 && x <= 1900) System.out.println("19");
			else if (x > 1900 && x <= 2000) System.out.println("20");
			else if (x > 2000 && x <= 2100) System.out.println("21");
			else System.out.println("Valor fora do escopo");
			
		}
		
		
		sc.close();
	}

}
