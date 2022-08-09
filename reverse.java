package methods;

import java.util.Scanner;

public class reverse {
public static void main (String args[]) {
 Scanner scan = new Scanner(System.in);
 System.out.println("enter the number");
 long num;
 num = scan.nextLong();
 long reverse = 0,rem;
 while (num!=0) {
	 rem = num%10;
	 reverse = (reverse*10)+rem;
	 num =num/10;
	 System.out.println("revesed num is :" +reverse);
 }

		
		
		
	
	
	
	
	
	
	
	
	
}

}
