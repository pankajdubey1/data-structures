package com.datastructures.tree.traversal;

import java.util.PriorityQueue;
import java.util.Queue;

import com.datastructures.tree.BstNode;

public class BFT {

	public void traverse(BstNode root) {
		if (root == null) {
			System.out.println("Empty");
		} else {
			Queue<BstNode> queue = new PriorityQueue<BstNode>();
			queue.add(root);

			while (true) {
				BstNode poll = queue.poll();
				if (poll != null) {
					if (poll.getLeft() != null)
						queue.add(poll.getLeft());
					if (poll.getRight() != null)
						queue.add(poll.getRight());
					System.out.println(poll.getData());
				} else {
					break;
				}
			}
		}
	}
}
