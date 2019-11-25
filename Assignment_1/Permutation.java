package Com.Omniwyse.Assignment_1;

//Java program to print all permutations of a given string.

//Time Complexity: O(n*n!) Note that there are n! permutations and it requires O(n) time to print a permutation.

public class Permutation {
	static int count = 0;

	public static int stringPermutation(String permutation, String input) {
		if (input.length() == 0) {
			System.out.println("Permutation is " + permutation);
			count++;
		} else {
			for (int i = 0; i < input.length(); i++) {
				stringPermutation(permutation + input.charAt(i),
						input.substring(0, i) + input.substring(i + 1, input.length()));
				
			}
		}
		return count;
	}
}
