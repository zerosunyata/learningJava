import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents the Binary Tree data structure
 * @author Linda Crane
 * @author Melissa Sienkiewicz
 *
 */
public class BinaryTree {

	/**
	 * Reference to the root Node of the tree
	 */
	BinaryTreeNode root = null;

	/**
	 * Insert the data into the tree
	 * @param newData New int to store in the tree
	 */
	public void insertInTree (int newData) {
		if (root == null) 
			root = new BinaryTreeNode(newData);
		else 
			root.insert(newData);
	}

	/**
	 * Method to display the contents of the tree
	 */
	public void displayInOrder () {
		displayInOrder (root);
		System.out.println();
	}
	public void displayPreOrder () {
		displayPreOrder (root);
		System.out.println();
	}
	
	public void displayPostOrder () {
		displayPostOrder (root);
		System.out.println();
	}
	
	/**
	 * Traverse the tree using InOrder traversal and display the content to the console
	 * @param subRoot The node to start with
	 */
	private void displayInOrder (BinaryTreeNode subRoot){
		if (subRoot == null)   
			return;
		displayInOrder (subRoot.getLeft());
		System.out.print("," + subRoot.getData() + "");
		displayInOrder (subRoot.getRight());
	}
	
	private void displayPreOrder (BinaryTreeNode subRoot){
		if (subRoot == null)   
			return;
		System.out.print("," + subRoot.getData() + "");
		displayPreOrder (subRoot.getLeft());
		displayPreOrder (subRoot.getRight());
	}
	
	private void displayPostOrder (BinaryTreeNode subRoot){
		if (subRoot == null)   
			return;
		displayPostOrder (subRoot.getLeft());
		displayPostOrder (subRoot.getRight());
		System.out.print("," + subRoot.getData() + "");
	}
	//////
	public int maxDepth(BinaryTreeNode subRoot) {
		if(subRoot == null)
			return 0;
		int leftDepth = maxDepth(subRoot.getLeft());
		int rightDepth = maxDepth(subRoot.getRight());
		if(leftDepth > rightDepth)
			return leftDepth + 1;
		return rightDepth + 1;
		
	}
	//////
	
	private static boolean isAllElementsNull(List list) {
		for (Object object: list) {
			if (object != null)
				return false;
		}
		return true;
	}
	
	private static int maxLevel(BinaryTreeNode subRoot) {
		if(subRoot == null)
			return 0;
		return Math.max(BinaryTree.maxLevel(subRoot.getLeft()), BinaryTree.maxLevel(subRoot.getRight()))+1;
	}

	private static void printWhitespaces(int count) {
		for (int i = 0; i < count; i ++) {
            System.out.print(" ");

		}
	}
	
	public static void printNode(BinaryTreeNode root) {
		int maxLevel = BinaryTree.maxLevel(root);
        printNodeInternal(Collections.singletonList(root), 1, maxLevel);

	}
	
	private static void printNodeInternal(List<BinaryTreeNode> nodes, int level, int maxLevel) {
		if(nodes.isEmpty() || BinaryTree.isAllElementsNull(nodes))
			return;
		
		int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;
        
        BinaryTree.printWhitespaces(firstSpaces);
        
        List<BinaryTreeNode> newNodes = new ArrayList<BinaryTreeNode>();
        
        for(BinaryTreeNode node: nodes) {
        	if(node != null) {
        		System.out.print(node.getData());
        		newNodes.add(node.getLeft());
        		newNodes.add(node.getRight());
        		
        	} else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }
        	BinaryTree.printWhitespaces(betweenSpaces);
        }
        System.out.println("");
        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
            	BinaryTree.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                	BinaryTree.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).getLeft() != null)
                    System.out.print("/");
                else
                	BinaryTree.printWhitespaces(1);

                BinaryTree.printWhitespaces(i + i - 1);

                if (nodes.get(j).getRight() != null)
                    System.out.print("\\");
                else
                	BinaryTree.printWhitespaces(1);

                BinaryTree.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
	}
}
