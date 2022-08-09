package methods;

import java.util.Scanner;

public class sumAvg {
	public static void main(String args[]) {
		int n ;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a limit :");
		n = in.nextInt();
		int sum = 0,a;
		for (int i=1;i<=n;i++){
			System.out.println("enter the numer"+i+":");
			a = in.nextInt();
			sum += a;
	}
		System.out.println("The sum of the number is : "+ sum);
		System.out.println("the average of the number is :" +sum/n);
		 

	}

}
