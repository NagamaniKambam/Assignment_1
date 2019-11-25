package Com.Omniwyse.Assignment_1;

public class PrimeNumber_P2 {
   public static boolean checkPrime(int number)
   {
	   if(number <= 1) {
		   return false;
	   }
	   for(int i=2; i <= number; i++)
	   {
		   if( number % i == 0)
		   {
			   return false;
		   }
	   }
	return true;
   }
}
