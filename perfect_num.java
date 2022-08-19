package methods;

import java.util.Scanner;

public class perfect_num {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		
		int a=in.nextInt();
		int sum=0;
		for (int i =1;i<=a;i++) {
			if(a%i==0) {
				sum+=i;
				
			}}
			if (sum==a){
				System.out.println("ther number is perfect");
			}
			else {
				System.out.println("the number is not perfect");
			}
		}
		
		
	}

