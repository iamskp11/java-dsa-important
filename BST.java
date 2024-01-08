/*
 * 
 * Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
 */

class Node {
	public int value;
	public Node left;
	public Node right;
	public Node() {
		this.value = 0;
		this.left = null;
		this.right = null;
	}
	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

public class BST {
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(3);
		root.left.right = new Node(7);
		root.right.right = new Node(18);
		root.right.left = new Node(13);
		root.left.left.left = new Node(1);
		root.left.right.left = new Node(6);

		int res = rangeSumBST(root, 6, 10);
		System.out.print(res);

	}

	static int rangeSumBST(Node root, int left, int right) {
		if(root==null) return 0;
		if(root.value < left) return rangeSumBST(root.right, left, right);
		if(root.value > right) return rangeSumBST(root.left, left, right);
		return root.value + rangeSumBST(root.right, left, right) + rangeSumBST(root.left, left, right);
	}

}


