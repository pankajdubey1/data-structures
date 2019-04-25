package com.datastructures.tree;

public class BSTUtil {

	public static BinarySearchTree createSampleBST() {
		BinarySearchTree bst = new BinarySearchTree();
		BstNode node = new BstNode(15);
		bst.root = node;

		bst.insert(bst.root, 12);
		bst.insert(bst.root, 17);
		bst.insert(bst.root, 10);
		bst.insert(bst.root, 11);
		bst.insert(bst.root, 19);
		bst.insert(bst.root, 21);
		return bst;
	}
}
