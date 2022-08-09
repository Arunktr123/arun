package methods;

import java.util.Scanner;

public class prac3 {
public static void main(String args[]) {
//	int num;
//	Scanner scan = new Scanner(System.in);
//	System.out.println("enter three digit number: ");
//	num = scan.nextInt();
	
	int digit1,digit2,digit3;
	for (int number =100;number<=999;number++) {
			int temp=number;
	
	digit3 = temp%10;
	temp = temp/10;
	
	
	digit2= temp%10;
	temp=temp/10;
	
	digit1 = temp%10;
	
	 int result =(digit3*digit3*digit3)+ (digit2*digit2*digit2)+(digit1*digit1*digit1);
	 
		
	if(result==number) {
		System.out.println(number+" The number is an amstrong");
		
	}
	//em.out.println("The num is not an amstrong num");
		
	}
	}
	
	
	
	
}

