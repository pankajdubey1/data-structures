package com.datastructures.stack.usinglinkedlist;

public class LinkedList {

	Node head;

	public void insertAtBeginning(int data) {
		Node node = new Node(data);
		if (this.head == null)
			this.head = node;
		else {
			Node temp = this.head;
			this.head = node;
			node.setNext(temp);
		}
	}

	public int deleteFromBeginning() {
		Node temp = this.head;
		this.head = temp.getNext();
		int data = temp.getData();
		temp = null;
		return data;
	}

}
