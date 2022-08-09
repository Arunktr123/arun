package exercise;

import java.util.Scanner;

public class exercise32 {
	public static void main(String args[]) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number:");
		num = scan.nextInt();
		if (num >= 0) {
			System.out.println("It is positive");
		} 
		else {
			System.out.println("It is negative");
		}

	}

}
