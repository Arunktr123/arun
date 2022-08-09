package exercise;

import java.util.Scanner;

public class exercise20 {
	public static void main(String args[]) {
		
		
		
		Scanner value = new Scanner(System.in);
		int x;

		System.out.println("ENTER THE VALUE OF x:");
		x = value.nextInt();
		System.out.println(x = x++ * 2 + 3 * --x);

	}
}
