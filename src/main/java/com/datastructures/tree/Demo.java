package com.datastructures.tree;

public class Demo {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		BstNode node = new BstNode(15);
		bst.root = node;

		bst.insert(bst.root, 12);
		bst.insert(bst.root, 17);
		bst.insert(bst.root, 10);
		bst.insert(bst.root, 11);
		bst.insert(bst.root, 19);
		bst.insert(bst.root, 21);

		boolean found = bst.search(bst.root, 21);
		System.out.println(found);

		System.out.println(bst.findMin(bst.root));

		System.out.println(bst.findMax(bst.root));
		
		System.out.println(bst.findHeight(bst.root));
	}

}
