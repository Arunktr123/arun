package exercise;

import java.util.Scanner;

public class exercise31 {
public static void main (String args [] ) {
	//31) Program to Find the Roots of a Quadratic Equation
	int a,b,c;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a value of a:");
	a= scan.nextInt();
	System.out.println("enter the value of b");
	b= scan.nextInt();
	System.out.println("enter the value of c");
	c=scan.nextInt();
	double determinant = (b*b-4*a*c);
	double sqrt = Math.sqrt(determinant);
	if (determinant>0) {
		double firstroot = (-b+(sqrt)/2*a);
		double secondroot=(-b-(sqrt)/2*a);
		System.out.println("roots are ::"+firstroot+" and "+secondroot);
		
		
	}
	else if(determinant==0){
		System.out.println("root is: "+ (-b-(sqrt))/2*a );
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
