package methods;

import java.util.Scanner;

public class prime_number {
	public static void main(String args[]) {
		//Scanner in = new Scanner(System.in);
		// System.out.println("enter the number");
		// int a = in.nextInt();

		int f = 0;
		int i;
		int a;
		for (a = 1; a <= 999; a++) {
			for (i = 1; i <= a; i++) {
				if (a % i == 0) {
					f++;
				}

			}

			if (f == 2) {
				System.out.println(a + "is prime number");
			}
			f = 0;
		}
	}
}
