/**
 * Tests the BinaryTree and Node class.
 * @author Linda Crane
 * @author Melissa Sienkiewicz
 *
 */
public class BinaryTreeExample {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.insertInTree(6);
		tree.insertInTree(3);
		tree.insertInTree(9);
		tree.insertInTree(1);
		tree.insertInTree(15);
		tree.insertInTree(7);
		
		tree.displayInOrder();
//		BinaryTree.printNode(tree.root);
		System.out.println("\nHeight of the tree is " + tree.maxDepth(tree.root));
	}

}
