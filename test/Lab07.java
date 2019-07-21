

public class Lab07 {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.insertInTree(6);
		tree.displayInOrder();
		BinaryTree.printNode(tree.root);

		tree.insertInTree(3);
		tree.displayInOrder();
		BinaryTree.printNode(tree.root);
		tree.insertInTree(9);
		tree.displayInOrder();
		BinaryTree.printNode(tree.root);
		tree.insertInTree(1);
		tree.displayInOrder();
		BinaryTree.printNode(tree.root);
		tree.insertInTree(15);
		tree.displayInOrder();
		BinaryTree.printNode(tree.root);
		tree.insertInTree(7);
		tree.displayInOrder();
		BinaryTree.printNode(tree.root);
		
//		
//		tree.displayInOrder();
//		BinaryTree.printNode(tree.root);
//		tree.displayPreOrder();
		
		
//		tree.insertInTree(53);
//		tree.insertInTree(60);
//		tree.insertInTree(22);
//		tree.insertInTree(54);
//		tree.insertInTree(10);
//		tree.insertInTree(24);
//		tree.insertInTree(23);
//		tree.displayInOrder();
//		BinaryTree.printNode(tree.root);
//		tree.displayPreOrder();
//		
//		tree.insertInTree(4);
//		tree.insertInTree(10);
//		tree.insertInTree(1);
//		tree.insertInTree(16);
//		tree.insertInTree(22);
//		tree.insertInTree(14);
//		tree.insertInTree(15);
//		tree.displayInOrder();
//		BinaryTree.printNode(tree.root);
//		tree.displayPostOrder();
//		
//		tree.insertInTree(24);
//		tree.insertInTree(22);
//		tree.insertInTree(54);
//		tree.insertInTree(10);
//		tree.insertInTree(23);
//		tree.insertInTree(30);
//		tree.insertInTree(60);
//		tree.displayInOrder();
//		BinaryTree.printNode(tree.root);
//		tree.displayPreOrder();

//		tree.insertInTree(32);
//		tree.insertInTree(8);
//		tree.insertInTree(60);
//		tree.insertInTree(54);
//		tree.insertInTree(10);
//		tree.insertInTree(2);
//		tree.insertInTree(20);
//		tree.displayInOrder();
//		BinaryTree.printNode(tree.root);
//		tree.displayPreOrder();
//		tree.displayPostOrder();

		System.out.println("\nHeight of the tree is " + tree.maxDepth(tree.root));
	}
}
