package Com.Omniwyse.Assignment_1;

//Time Complexity is O(Log min(a, b))


public class FindGCD
{
  // extended Euclidean Algorithm
  public static int gcd(int divider, int remainder)
  {
      if (divider == 0)
          return remainder;
       
      return gcd(remainder % divider, divider);
  }

//Driver Program
  /**
   * public static void main(String[] args)
  {
      int divider = 10, remainder = 15, gcdvalue;
      gcdvalue = gcd(divider, remainder);
      System.out.println("GCD(" + divider +  " , " + remainder+ ") = " + gcdvalue);
       
      divider = 35; remainder = 10;
      gcdvalue = gcd(divider, remainder);
      System.out.println("GCD(" + divider +  " , " + remainder+ ") = " + gcdvalue);
       
      divider = 31; remainder = 2;
      gcdvalue = gcd(divider, remainder);
      System.out.println("GCD(" + divider +  " , " + remainder+ ") = " + gcdvalue);

  }
  */
}