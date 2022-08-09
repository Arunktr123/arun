package exercise;

import java.util.Scanner;

public class exercise30 {

	public static void main(String args[]) {
		// 30) Program to Find the Largest Number Among Three Numbers
		float x, y, z, med, largest;
		Scanner large = new Scanner(System.in);
		System.out.println("enter a number");
		x = large.nextFloat();
		System.out.println("enter a number");
		y = large.nextFloat();
		System.out.println("enter a number");
		z = large.nextFloat();
		med = x > y ? x : y;
		largest = med > z ? med : z;
		System.out.println("the largest value is :" + largest);
		large.close();

	}
}
