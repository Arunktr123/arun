package Examples;
import java.util.Scanner;

public class operator {
	public static void main(String[] args){
		int a,b;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number");
		 a = scan.nextInt();
		System.out.println("enter second number");
		 b = scan.nextInt();
		 System.out.println("enter the operator + ,-, *,/or%");
char operator;
operator = scan.next().charAt(0);
switch(operator) {

case '+':
	System.out.println(a+"+"+b+"="+(a+b));
	break;
case '-':
	System.out.println(a+"-"+b+"="+(a-b));
	break;
case '*':
	System.out.println(a+"*"+b+"="+(a*b));
	break;
case '%':
	System.out.println(a+"%"+b+"="+(a%b));
	break;
	
	


















}





		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
