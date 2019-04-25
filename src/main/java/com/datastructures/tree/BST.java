package com.datastructures.tree;

public class BST {

	BstNode root;

	public BstNode insert(BstNode root, int data) {
		if (root == null)
			return new BstNode(data);
		else if (root.getData() > data)
			root.setLeft(insert(root.getLeft(), data));
		else
			root.setRight(insert(root.getRight(), data));
		return root;
	}

	public boolean search(BstNode root, int data) {
		if (root == null)
			return false;
		else if (root.getData() == data)
			return true;
		else if (root.getData() > data)
			return search(root.getLeft(), data);
		else
			return search(root.getRight(), data);
	}

	public int findMin(BstNode root) {
		if (root == null)
			return -1;
		else if (root.getLeft() == null)
			return root.getData();
		else
			return findMin(root.getLeft());
	}

	public int findMax(BstNode root) {
		if (root == null)
			return -1;
		else if (root.getRight() == null)
			return root.getData();
		else
			return findMax(root.getRight());
	}

	public int findHeight(BstNode root) {
		if (root == null)
			return -1;
		else {
			int leftHeight = findHeight(root.getLeft());
			int rightHeight = findHeight(root.getRight());
			return getMax(leftHeight, rightHeight) + 1;
		}
	}

	private int getMax(int leftHeight, int rightHeight) {
		return leftHeight >= rightHeight ? leftHeight : rightHeight;
	}
}
