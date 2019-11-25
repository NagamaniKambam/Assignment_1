package Com.Omniwyse.Assignment_3;

/**
 * Write a program to create binary search tree with the following functions.

    a. Insert an element in to the tree
    b. Delete an element from the tree
    c. Search for an element in the tree
    d. Traverse the tree  (Print the elements of tree in Inorder, Preorder and Postorder)
    e. Find the number of leaves in the tree
    f. Find the height of a tree
 * @author User
 *
 */


public class BinaryTree {
	class Node  {
		int data;
		Node left;
		Node right;
	}
	//class BST  {
		
		public Node createNewNode(int k) {
			Node a = new Node();
			a.data = k;
			a.left = null;
			a.right = null;
			return a;
		}
		
		public Node insert(Node node, int val)  {
			if(node == null)  {
				return createNewNode(val);
			}
			if(val < node.data) {
				node.left = insert(node.left, val);
			}
			else if(val > node.data) {
				node.right = insert(node.right, val);
			}
			return node;
		}
		public Node delete(Node node,int val) {
			if(node == null) {
				return null;
			}
			if(val < node.data) {
				node.left = delete(node.left, val);
			}
			else if(val > node.data) {
				node.right = delete(node.right, val);
			}
			else {
				if(node.left == null || node.right == null) {
					Node temp = null;
					temp = node.left == null ? node.right : node.left;
					
					if (temp == null) {
						return null;
					}
					else {
						return node;
					}
				 }
				else {
					Node successor = getSuccessor(node);
					node.data = successor.data;
					node.right = delete(node.right, 4);
					return node;
				}
			}
			return node;
		}
		public Node getSuccessor(Node node) {
			if(node == null) {
				return null;
			}
			Node temp = node.right;
			while(temp != null) {
				temp = temp.left;
			}
			return temp;
		}
		public Node search(Node node, int val) 
		{ 
		    // Base Cases:Node means root. Root is null or key is present at root 
		    if (node==null || node.data==val) 
		        return node; 
		  
		    // val is greater than root's key 
		    if (node.data > val) 
		        return search(node.left, val); 
		  
		    // val is less than root's key 
		    return search(node.right, val); 
		} 
	//}  
}
/**
 * public static void main(String args[])
 
{
	BinaryTree bt = new BinaryTree();
	Node root = null;
	root = a.insert(root, 8);
}
*/
