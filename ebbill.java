package methods;
import java.util.Scanner;
public class ebbill {
	public static void main (String args[]) {
		Scanner scan=new Scanner(System.in);
		int unit;
		System.out.println("enter unit:");
	unit = scan.nextInt();
double billpay= 0;
if(unit<100)
	billpay = unit*1.50;
else if (unit<200&&unit>100)
	billpay = unit*3.00;
else if (unit<300)
	billpay = unit*5.00;
System.out.println("BILL AMOUNT:"+billpay);
scan.close();







	}
	
}
