package exercise;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Scanner;
;
public class exercise{
	
	public static void main(String[] args){//
		
		//ouestion1
//		
//		int a = 7;
//				
//		for (int i = 1; i <=10; i++) {
//System.out.println(a*i);
//System.out.println(a-i);
       //question 2
//char a1;
//for (a1 = 'm';a1<='z';a1++)
//{
//	System.out.println(a1);
	

//question23
	
//int x = 5;
//int x1 = ++x - x++ + --x;
//System.out.println(x1);
	
	
	//question18
		//1)
	//int a = 30;
			//int b = 6;
			
			//int x=69>>>2;
		
			//System.out.println(++a-b--);
			//System.out.println(a%b++);
			//System.out.println(a*=b+5);
			//System.out.println(x);
		//question 19
			
			//int a = 28;
			
			//System.out.println(a+= a++ + ++a + --a + a--);
		
		//question20
		//int x = 10;
		//System.out.println(x=x++ * 2+3 * --x);
		
		//question21
//		int y =10;
//		int z = (++y* (y++ + 5));
//		System.out.println(z);
		
		//question 22
		//char c = 'z';
//		int ascii = c;
//		System.out.println("the ascii value of " + c + "is" + ascii);
		
		//question 25
		
//		int dividend = 60; int divisor = 6;
//		int quotient = dividend / divisor;
//		int remainder = dividend % divisor;
//		System.out.println("the divisor is = " + quotient);
//		System.out.println("the quotient is = " + remainder);
		
//	question 26
//		long num1 = 10l;
//		long num2 = -10l;
//		System.out.println("num1="+ num1);
//		System.out.println("num2="+ num2);
//		
		//question 27
//		int x,y,t;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the value of x and y" );
//		x = sc.nextInt();
//		y = sc.nextInt();
//		System.out.println("before swapping numbers: "+x +"  "+ y);  
//
//		t = x ;
//		x = y ; 
//		y = t ;
//		System.out.println("after swapping numer:  "+x+"  "+y);
		
		
//		question 28
//		Scanner reader = new Scanner(System.in);
//		System.out.print("enter the number:");
//		int num = reader.nextInt();
//		if(num % 2 == 0){
//		
//		System.out.println(num + " is even");
//		}
//		 else  {
//			
//			System.out.println(num + " is odd");}

		
		//	question 29
		
//		char al = 'i';
//		if (al == 'a' || al == 'e' || al == 'i' || al == 'o' || al == 'u')
//			System.out.println(al+"is vowel");
//		else
//			System.out.println(al  +   "  is consonant");
		
		
		
		//question no:30
		
		
//		int a,b,c,largest,temp;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the first number:");
//		a = sc.nextInt();
//		System.out.println("enter the second number:");
//		b = sc.nextInt();
//		System.out.println("enter the third number");
//		c = sc.nextInt();
//		
//		//comparing a and b and storing the largest number in a temp variable  
//		temp = a>b?a:b;
//		//comparing the temp variable with c and storing the result in the variable  
//		largest = c>temp?c:temp;
//		System.out.println("the largest value is " + largest);

		
		//question 31
		
//		double firstRoot = 0;double secondRoot = 0;
//		Scanner reader = new Scanner(System.in);
//		System.out.println("enter the value a");
//		double a = reader.nextDouble();
//		System.out.println("enter the value of b");
//		double b = reader.nextDouble();
//		System.out.println("enter the value of c");
//		double c = reader.nextDouble();
//		
//		double determinant = (b*b - 4*a*c); 
//		double sqrt = Math.sqrt(determinant);
//		
		
//		
//		if(determinant>0) {
//			firstRoot = (+b +(sqrt) / 2*a);
//		secondRoot = (-b -(sqrt)/ 2*a);
//		System.out.println(" roots are ::" + firstRoot + "and" + secondRoot);}
//		else if 
//			(determinant ==0) {
//			System.out.println("root is :: " + (-b + sqrt/ 2*a));}
		
		
		
		
		//question no : 32
//		 int num;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the  number:");
//		num = sc.nextInt();
//		if(num> 0)
//		System.out.println("it is positive" );
//		else if(num<0)
//		System.out.println("it is negative");
//		else 
//			System.out.println("neither positive nor negative");

		
		
		
		
		
		
		//question no :		33
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		char ch;
//		System.out.println("enter the  number or letter:");
//		ch = sc.next().charAt(0);
//		
//		if((ch >= 'A' && ch <= 'Z') || ch>= 'a' && ch <= 'z')
//		
//			{System.out.println(ch + "is aplhabet" );}
//		else {
//			System.out.println(ch+ "is not alphabet");
//		
		
		
		
		// question no 34
		
	
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number");
//		int num = sc.nextInt();
//		int i =1, fact =1;
//        while(i<=num) {
//        
//            fact=fact*i;
//            i++;}
//		System.out.println("factorial of the number: "+ fact);
//		
		
		
		
		//question no: 35
//int i;
//		int [] arr = new int[] {0,1,5,7,4};
//		System.out.println("elements of a given array present on even position ");
//		for( i=0; i<arr.length;i=i+2 )
//		{	
//	System.out.println(arr[i]);
//	
//		}

		
		
		
		//questio no : 36
//		int i;
//		int [] arr = new int[] {1,2,3,4,5};
//		System.out.println("elements of a given array present on odd position ");
//		for( i=1; i<arr.length;i=i+2
//				)
//		{	
//	System.out.println(arr[i]);}
//		
//		
//		
		
		
		
		
		
		//question no:37
//		int i;
//		int [] arr = new int[] {1,2,3,4,5};
//		System.out.println("elements of a given array present on odd position ");
//		for( i=1; i<arr.length;i=i+2
//				)
//		{	
//	System.out.println(arr[i]);}
		
		//qestion no:38
	
		
		//Java Program to print the largest element in an array
//		
//		int [] arr = new int [] {67,89};
//		 
//		int max = arr[0];
//		 int i;
//		 
//		for( i=0; i<arr.length;i++){
//		if(arr[i]> max)
//		max = arr[i];}
//		{System.out.println("largest number present in given array:" + max);}
//		
		
		
		//question no: 38
		//Java Program to print the smallest element in an array
//     int [] arr = new int [] {67,89,403,538};
//		 
//		int min = arr[0];
//		int i;
//		
//		for( i=0; i>arr.length;i++){
//    	if(arr[0]> min)
//		min = arr[0];}
//		{System.out.println("smalest number present in given array:" + min);}
		
		
		
		//question no: 39
//		
//		int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
//		System.out.println("elements in array:"+ arr.length);
		
		
		
		
		//question no: 40
		
//		
//		int arr1[] = new int[] {1,2,3};
//		int arr2[] = new int [arr1.length];
//		int i;
//		
//		for ( i = 0;i<arr1.length;i++)
//		arr2[i] = arr1[i];
//		
//		System.out.println("elements of original array");
//		for ( i = 0;i<arr1.length;i++) {
//			System.out.println(arr1[i] + "");
//			
//		}
//		System.out.println();
//		System.out.println("elements of new array");
//		for ( i = 0;i<arr2.length;i++) {
//			System.out.println(arr2[i] + "");}
			
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
				
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
			
			}
		
		
		
		
		


