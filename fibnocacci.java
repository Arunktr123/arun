package methods;

import java.util.Scanner;

public class fibnocacci {
	public static void main(String args[]) {
		Scanner in  = new Scanner(System.in);
		int n ;
		System.out.println("enter the limit :");
		n =in.nextInt();
		int a=-1,b=1,c;// =a+b;
		
				
		for (int i=0;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
			
		}
		
		
		
	}

}
