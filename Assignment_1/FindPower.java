package Com.Omniwyse.Assignment_1;

public class FindPower {
/* Function to calculate number raised to the power powernumber */
    static int power(int number, int powernumber)
    {
        if (powernumber == 0)
        {
            return 1;
        }
        else if (powernumber % 2 == 0)
        {
            return power(number, powernumber / 2) * power(number, powernumber / 2);
        }
        else
        {
            return number * power(number, powernumber / 2) * power(number, powernumber / 2);
        }
    }
 
    /* Program to test function power */
    public static void main(String[] args)
    {
        System.out.printf("%d", power(2, 3));
    }
}