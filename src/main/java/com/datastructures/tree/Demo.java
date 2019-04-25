package com.datastructures.tree;

public class Demo {

	public static void main(String[] args) {

		BinarySearchTree bst = BSTUtil.createSampleBST();

		boolean found = bst.search(bst.root, 21);
		System.out.println(found);

		System.out.println(bst.findMin(bst.root));

		System.out.println(bst.findMax(bst.root));

		System.out.println(bst.findHeight(bst.root));
	}

}
