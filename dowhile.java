package methods;

import java.util.Scanner;

public class dowhile {
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int a = scan.nextInt();
		int i = 1;
		do {
			System.out.println(i*a);
			i++;
			
		}while(i<=a);
		scan.close();
		
		
	}

}
