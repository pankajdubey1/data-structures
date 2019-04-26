package com.datastructures.tree.traversal;

import com.datastructures.tree.BSTUtil;
import com.datastructures.tree.BinarySearchTree;

public class Demo {

	public static void main(String[] args) {
		BinarySearchTree bst = BSTUtil.createSampleBST();
		BSTTraverser bft = new BSTTraverser();

		bft.bft(bst.root);

		System.out.println("......");

		bft.preOrder(bst.root);

		System.out.println("......");

		bft.inOrder(bst.root);

		System.out.println("......");

		bft.postOrder(bst.root);
	}

}
