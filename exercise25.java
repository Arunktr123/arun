package exercise;

import java.util.Scanner;

public class exercise25 {
	public static void main(String args[]) {

		// 25) Program to Compute Quotient and Remainder
		Scanner value = new Scanner(System.in);
		System.out.println("enter the dividend");
		int a = value.nextInt();
		System.out.println("enter the divisor");
		int b = value.nextInt();
		int quotient = a / b;
		int remainder = a % b;
		System.out.println("Quotient is: " + quotient);
		System.out.println("Remainder is " + remainder);

	}
}
