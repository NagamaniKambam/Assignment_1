package Com.Omniwyse.Assignment_3;

import org.junit.Test;

public class TestBinarySearchTree {

	@Test
	public void test() {
		
		//1)---CREATING A BINARY SEARCH TREE-----
		
		BinarySearchTree tree = new BinarySearchTree();
		 	
		 //2)-----INSERTING ELEMENTS IN TO TREE-----
		 
		 	tree.insert(11); 
	        tree.insert(6); 
	        tree.insert(8); 
	        tree.insert(19); 
	        tree.insert(4); 
	        tree.insert(10); 
	        tree.insert(5); 
	        tree.insert(17);
	        tree.insert(43); 
	  
	      //3)----TRAVERSING TREE IN INORDER(),PREORDER(),POSTORDER()
	        System.out.print("InOrder Traversal:");
	        tree.printInorder(tree.root);
	        System.out.println();
	        System.out.print("PreOrder Traversal:");
	        tree.printPreorder(tree.root);
	        System.out.println();
	        System.out.print("PostOrder Traversal:");
	        tree.printPostorder(tree.root);
	        System.out.println();
	        
	       //4)--SEARCHING AN ELEMENT IN BST-----
	        
	        System.out.println(tree.search(tree.root, 10)+" is found");
	        
	     //5)---DELETE ELEMENT FROM BST----
	        tree.deleteKey(4);
	        
	      // ---TREE AFTER DELETING ELEMENT
	        System.out.println("After deleting element tree is:");
	        tree.printInorder(tree.root);
	        
	      //6)---HEIGHT OR DEPTH OF TREE---
	        System.out.println();
	        System.out.println("Height of tree is:"+tree.maxDepth(tree.root));
	        
	      //7)---NUMBER OF LEAVES---
	        System.out.println("Number of leaves are:"+tree.getLeafCount(tree.root));
	               
	}
}
