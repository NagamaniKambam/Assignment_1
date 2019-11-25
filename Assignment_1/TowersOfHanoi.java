package Com.Omniwyse.Assignment_1;

//Java recursive program to solve tower of hanoi puzzle

public class TowersOfHanoi {
//Java recursive function to solve tower of hanoi puzzle
	static void towerOfHanoi(int n, String string, String string2, String string3) {
		if (n == 1) {
			System.out.println("Move disk 1 from rod " + string + " to rod " + string2);
			return;
		}
		towerOfHanoi(n - 1, string, string3, string2);
		System.out.println("Move disk " + n + " from rod " + string + " to rod " + string2);
		towerOfHanoi(n - 1, string3, string2, string);
	}

	// Driver method
	//public static void main(String args[]) {
		//towerOfHanoi(3, 'A', 'C', 'B'); // A, B and C are names of rods
	//}
}
