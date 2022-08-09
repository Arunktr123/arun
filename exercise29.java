package exercise;

import java.util.Scanner;

public class exercise29 {
	public static void main(String args[]) {
		// 29) Program to Check Whether a Character is a Vowel or Consonant
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("enter a letter");
//		char al;
//
//		al = scan.nextLine().charAt(0);
//
//		if (al == 'a' || al == 'e' || al == 'i' || al == 'o' || al == 'u' || al == 'A' || al == 'E' || al == 'I'
//				|| al == 'O' || al == 'U') {
//			System.out.println(al + " It is vowel");
//
//		} else if (al < 65 || al > 90) {
//
//			System.out.println("incorrect");
//		} else {
//			System.out.println(" It is Consonant");
//		}
//or in switch model
	
		char c;
		int al = 0;
		
		Scanner m = new Scanner(System.in);
		System.out.println("ENTER ONlY ALPHABET:");
		c=m.next().charAt(0);
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case '1':
			if ((al < 65 || al > 90)) {
		
		    System.out.println("Incorrect input");
		    break;}
			
			
			System.out.println(c+"  is vowel");
			break;
			default:
			System.out.println(c+" is consonant");
		    break;
		    
		    
		    	
				
	}
	}
    }	
		
		
		
		
		
		
 	

