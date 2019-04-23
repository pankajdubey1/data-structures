package com.datastructures.linkedlist.doubly;

public class DoublyLinkedList {

	Node head;

	public void insertAtHead(int data) {
		Node node = new Node(data);
		Node temp = this.head;
		node.setNext(temp);
		this.head = node;
		temp.setPrev(node);
	}

	public void printList(Node head) {
		if (head == null)
			return;
		System.out.print(head.getData() + " ");
		printList(head.getNext());
	}

}
