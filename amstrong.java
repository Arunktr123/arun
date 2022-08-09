package methods;

import java.util.Scanner;

public class amstrong {
	public static void main(String args[]) {
		
		
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("enter a three digit number");
		num = in.nextInt();
		
		int temp=num;
		int digit1,digit2,digit3;
		digit3 = temp%10;
		temp =temp/10;
		
		digit2 = temp%10;
		temp = temp/10;
		
		digit1 = temp%10;
		
		int result =  (digit3*digit3*digit3)+(digit2*digit2*digit2)+(digit1*digit1*digit1);
		if (result==num) {
			System.out.println("The number is an amstrong");
			
		}
		else {
			System.out.println("The number is not an amstrong number");
		}
				
				
				
		
		
		
		
	}
	

}
