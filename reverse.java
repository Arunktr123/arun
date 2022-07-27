package Examples;

public class reverse {
public static void main (String args[]) {
	
double num = 123456789l;
			double reverse = 0l;
	
	System.out.println("original number:" + num);
	
	while (num!= 0) {
		 double digit = num%100;
		reverse = reverse*100+digit;
num /=100;
}
		System.out.println("reverse number:"+reverse);
	
		
		
	
	
	
	
	
	
	
	
	
}

}
