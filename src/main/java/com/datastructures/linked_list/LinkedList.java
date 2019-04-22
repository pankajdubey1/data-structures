package com.datastructures.linked_list;

public class LinkedList {

	Node head;

	public void add(Node node) {
		if (this.head == null)
			this.head = node;
		else
			addAtTheEnd(node);
	}

	public void add(int index, Node node) {
		if (index == 1) {
			Node temp = this.head;
			this.head = node;
			node.setNext(temp);
		} else
			addAtIndex(index, node);
	}

	private void addAtIndex(int index, Node node) {
		Node temp = this.head;
		int count = 2;
		while (count != index) {
			temp = temp.getNext();
			count++;
		}
		Node temp1 = temp.getNext();
		temp.setNext(node);
		node.setNext(temp1);
	}

	private void addAtTheEnd(Node node) {
		Node temp = this.head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(node);
	}

}
