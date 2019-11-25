package Com.Omniwyse.Assignment_1;

//Java program for Fibonacci Series using Space
//Time Complexity is O(n)
//Space Complexity is O(1)

public class FibonacciSeries {
	static int fib(int number) {
		if (number <= 1) {
			return number;
		} else {
			return fib(number - 1) + fib(number - 2);
		}
	}

	public static void main(String args[]) {
		System.out.println("Fibonacci of " + 8 + " is : " + fib(8));
	}
}
