package printpowerbill;

import java.util.Scanner;

public class FindingBillAmount {
   public static void main(String args[])
   {
	   int units;
	   double ans;
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Give me number of units : ");
	   units = sc.nextInt();
	   if(units < 100)
	   {
		   ans = (float) (2.50 * units);
		   System.out.println("Cost of "+units+ " is : "+ans);
	   }
	   else if(units >= 100 & units<500 )
	   {
		   double min = units - 100;
		   double max = 100 * 2.50;
		   ans =  (min * 3.00);
		   double sum = ans + max;
		   System.out.println("Cost of "+units+ " is : "+sum);
	   }
	   else if(units >= 500 )
	   {
//		   double min = 100 * 2.5;
//		   double max = 400 * 3.0;
//		  double  ans1  = (units-500)*4.5; 
//		   double sum = min + max + ans1;
		   System.out.println("Cost of "+units+ " is : "+ (250+1200+((units-500)*4.50))); 
	   }
	   }
   }

