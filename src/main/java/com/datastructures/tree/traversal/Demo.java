package com.datastructures.tree.traversal;

import com.datastructures.tree.BSTUtil;
import com.datastructures.tree.BinarySearchTree;

public class Demo {

	public static void main(String[] args) {
		BinarySearchTree bst = BSTUtil.createSampleBST();
		BFT bft = new BFT();
		bft.traverse(bst.root);
	}

}
