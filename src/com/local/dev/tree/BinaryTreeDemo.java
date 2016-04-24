package com.local.dev.tree;

public class BinaryTreeDemo {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(40);
		bst.insert(25);
		bst.insert(78);
		bst.insert(10);
		bst.insert(3);
		bst.insert(17);
		bst.insert(32);
		bst.insert(30);
		bst.insert(38);
		bst.insert(78);
		bst.insert(50);
		bst.insert(93);
		
		System.out.println("Inorder");
		bst.printInOrder();
		System.out.println("Preorder");
		bst.printPreOrder();
		System.out.println("Postorder");
		bst.printPostOrder();
		
		System.out.println("Min: " + bst.findMinimum());
		System.out.println("Max: " + bst.findMaximum());
	}
}
