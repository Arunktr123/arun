package methods;

import java.util.Scanner;

public class loop {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.printf("enter the number : ");
		int n = scan.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.println(i);
			i=i+2;
			scan.close();
		}

	}

}
