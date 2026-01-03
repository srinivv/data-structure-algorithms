package com.local.dev.universal;

// Find the lowest common ancestor

/*
	Given values of two values n1 and n2 in a Binary Search Tree, find the Lowest Common Ancestor (LCA). 
	You may assume that both the values exist in the tree.
				 20
				/  \
			   8   22
			  / \
			 4   12
			     / \
			   10   14
			   
	Input: LCA of 10 and 14
	Output:  12
	Explanation: 12 is the closest node to both 10 and 14 
	which is a ancestor of both the nodes.

	Input: LCA of 8 and 14
	Output:  8
	Explanation: 8 is the closest node to both 8 and 14 
	which is a ancestor of both the nodes.

	Input: LCA of 10 and 22
	Output:  20
	Explanation: 20 is the closest node to both 10 and 22 
	which is a ancestor of both the nodes.			   
	
 */
class LowestCommonAncestor {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return null;
		}

		if (root == p || root == q) {
			return root;
		}

		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		if (left != null && right != null) {
			return root;
		}

		if (left != null) {
			return left;
		}

		if (right != null) {
			return right;
		}

		return null;
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
