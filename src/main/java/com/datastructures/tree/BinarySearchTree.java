package com.datastructures.tree;

public class BinarySearchTree {

    public BstNode root;

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

    public boolean isBinarySearchTree(BstNode root) {
        if (root == null)
            return true;
        else {
            int max = findMax(root.getLeft());
            int min = findMin(root.getRight());
            int data = root.getData();
            // findMax and finsMin functions return -1 in case the passing root is null, so handling the same in
            // the below if statement
            if ((data > max || max == -1) && (data < min || min == -1))
                return isBinarySearchTree(root.getLeft()) && isBinarySearchTree(root.getRight());
            else
                return false;
        }
    }

    public BstNode delete(BstNode root, int data) {
        if (root == null)
            return null;
        else if (data < root.getData())
            root.setLeft(delete(root.getLeft(), data));
        else if (data > root.getData())
            root.setRight(delete(root.getRight(), data));
        else {
            root = deleteNode(root);
        }
        return root;
    }

    private BstNode deleteNode(BstNode root) {
        // case 1: leaf node
        if (root.getLeft() == null && root.getRight() == null)
            root = null;
            // case 2: one child
        else if (root.getLeft() == null)
            root = root.getRight();
        else if (root.getLeft() != null)
            root = root.getLeft();
            // case 3: two child
        else {
            BstNode temp = findMinNode(root.getRight());
            root.setData(temp.getData());
            root.setRight(delete(root.getRight(), temp.getData()));
        }
        return root;
    }

    private BstNode findMinNode(BstNode root) {
        if (root == null)
            return null;
        else if (root.getLeft() == null)
            return root;
        else
            return findMinNode(root.getLeft());
    }
}
