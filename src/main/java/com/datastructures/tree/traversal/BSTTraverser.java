package com.datastructures.tree.traversal;

import java.util.PriorityQueue;
import java.util.Queue;

import com.datastructures.tree.BstNode;

public class BSTTraverser {

    public void bft(BstNode root) {
        if (root == null)
            System.out.println("Empty");
        else {
            Queue<BstNode> queue = new PriorityQueue<BstNode>();
            queue.add(root);
            while (!queue.isEmpty()) {
                BstNode poll = queue.poll();
                if (poll.getLeft() != null)
                    queue.add(poll.getLeft());
                if (poll.getRight() != null)
                    queue.add(poll.getRight());
                System.out.println(poll.getData());
            }
        }
    }

    public void preOrder(BstNode root) {
        if (root == null)
            return;
        System.out.println(root.getData());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void inOrder(BstNode root) {
        if (root == null)
            return;
        inOrder(root.getLeft());
        System.out.println(root.getData());
        inOrder(root.getRight());
    }

    public void postOrder(BstNode root) {
        if (root == null)
            return;
        inOrder(root.getLeft());
        inOrder(root.getRight());
        System.out.println(root.getData());
    }
}
