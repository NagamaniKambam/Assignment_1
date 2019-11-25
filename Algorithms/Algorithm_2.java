package Com.Omniwyse.Algorithms;

public class Algorithm_2 {
	static int N = 2; 
	  
	// Function to rotate the matrix 90 degree clockwise 
	static void rotate90Clockwise(int array[][]) 
	{ 
	  
	    // Traverse each cycle 
	    for (int i = 0; i < (N/2) ; i++) 
	    { 
	        for (int j = i; j < (N-1-i) ; j++) 
	        { 
	  
	            // Swap elements of each cycle 
	            // in clockwise direction 
	            int temp					= array[i][j]; 
	            array[i][j] 				= array[N - 1 - j][i]; 
	            array[N - 1 - j][i]         = array[N - 1 - i][N - 1 - j]; 
	            array[N - 1 - i][N - 1 - j] = array[j][N - 1 - i]; 
	            array[j][N - 1 - i] 		= temp; 
	        } 
	    }
	}
	static void printMatrix(int arr[][]) 
	{ 
	    for (int i = 0; i < N; i++) 
	    { 
	        for (int j = 0; j < N; j++) 
	        System.out.print( arr[i][j] + " "); 
	        System.out.println(); 
	    } 
	} 
	  
	// Driver code 
	  
	    public static void main (String[] args)  
	    { 
	    	int[][] arr = { {1, 2} , {3, 4} };
	      rotate90Clockwise(arr); 
	      printMatrix(arr); 
	    } 
}
