package Com.Omniwyse.Assignment_1;

public class Palindrome {
	// My Method to check
	public static boolean isPal(String string) { // if length is 0 or 1 then String is palindrome
		if (string.length() == 0 || string.length() == 1)
			return true;
		if (string.charAt(0) == string.charAt(string.length() - 1))
			/*
			 * check for first and last char of String: if they are same then do the same
			 * thing for a substring with first and last char removed. and carry on this
			 * until you string completes or condition fails Function calling itself:
			 * Recursion
			 */
			return isPal(string.substring(1, string.length() - 1));

		/*
		 * If program control reaches to this statement it means the String is not
		 * palindrome hence return false.
		 */
		return false;
	}

	/**
	 * public static void main(String[] args) {
		String str = "statement";
		String str1 = "madam";
		if (isPal(str)) {
			System.out.println("String is a palindrome");
		} else {
			System.out.println("String is not a palindrome");
		}
		if (isPal(str1)) {
			System.out.println("String is a palindrome");
		} else {
			System.out.println("String is not a palindrome");
		}
	}
	*/
}