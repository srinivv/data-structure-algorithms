package com.local.dev.tree;

public class BinarySearchTree {

	public Node<Integer> root;
	
	public BinarySearchTree insert(int value) {
		Node<Integer> node = new Node<Integer>(value);
		
		if (root == null) {
			root = node;
			return this;
		}
		insertNode(root, node);
		return this;
	}

	private void insertNode(Node<Integer> latestRoot, Node<Integer> node) {
		if (latestRoot.value > node.value) {
			if (latestRoot.left == null) {
				latestRoot.left = node;
				return;
			} else {
				insertNode(latestRoot.left, node);
			}
		} else {
			if (latestRoot.right == null) {
				latestRoot.right = node;
				return;
			} else {
				insertNode(latestRoot.right, node);
			}
		}
	}
	
	public int findMinimum() {
		if (root == null) {
			return 0;
		}
		Node<Integer> currentNode = root;
		while (currentNode.left != null) {
			currentNode = currentNode.left;
		}
		return currentNode.value;
	}


	public int findMaximum() {
		if (root == null) {
			return 0;
		}
		Node<Integer> currentNode = root;
		while (currentNode.right != null) {
			currentNode = currentNode.right;
		}
		return currentNode.value;
	}
	
	public void printInOrder() {
		printInOrder(root);
		System.out.println();
	}

	public void printInOrder(Node<Integer> currentRoot) {
		if (currentRoot == null) {
			return;
		}
		printInOrder(currentRoot.left);
		System.out.println(currentRoot.value + ", ");
		printInOrder(currentRoot.right);
	}

	public void printPreOrder() {
		printPreOrder(root);
		System.out.println();
	}

	public void printPreOrder(Node<Integer> currentRoot) {
		if (currentRoot == null) {
			return;
		}
		System.out.println(currentRoot.value + ", ");
		printInOrder(currentRoot.left);
		printInOrder(currentRoot.right);
	}

	public void printPostOrder() {
		printPostOrder(root);
		System.out.println();
	}

	public void printPostOrder(Node<Integer> currentRoot) {
		if (currentRoot == null) {
			return;
		}
		printInOrder(currentRoot.left);
		printInOrder(currentRoot.right);
		System.out.println(currentRoot.value + ", ");
	}
}
