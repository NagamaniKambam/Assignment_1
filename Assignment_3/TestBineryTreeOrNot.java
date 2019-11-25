package Com.Omniwyse.Assignment_3;

import org.junit.Test;

public class TestBineryTreeOrNot {

	@Test
	public void test() {
		 CheckBineryTreeOrNot tree = new CheckBineryTreeOrNot(); 
	        tree.root = new Node(4); 
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(5); 
	        tree.root.left.left = new Node(1); 
	        tree.root.left.right = new Node(3);
	  
	        if (tree.isBST()) 
	            System.out.println("It is Binary Search Tree"); 
	        else
	            System.out.println("It is Not a Binary Search Tree"); 
	}

}
