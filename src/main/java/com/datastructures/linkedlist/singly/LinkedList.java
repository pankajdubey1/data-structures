package com.datastructures.linkedlist.singly;

public class LinkedList {

	Node head;

	public void add(Node node) {
		if (this.head == null)
			this.head = node;
		else
			addAtTheEnd(node);
	}

	public void add(int position, Node node) {
		if (position == 1) {
			Node temp = this.head;
			this.head = node;
			node.setNext(temp);
		} else
			addAtIndex(position, node);
	}

	public void delete(int position) {
		Node temp = this.head;
		if (temp == null)
			System.out.println("List is empty");
		else if (position == 1) {
			this.head = temp.getNext();
			temp = null;
		} else
			deleteNode(position);
	}

	public void reverse() {
		Node current = this.head;
		Node prev = null;
		while (current != null) {
			Node next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		this.head = prev;
	}

	public void reversePrint(Node head) {
		if (head == null)
			return;
		reversePrint(head.getNext());
		System.out.print(head.getData() + " ");
	}

	public void reverse(Node p) {
		if (p == null || p.getNext() == null) {
			this.head = p;
			return;
		} else {
			reverse(p.getNext());
			Node q = p.getNext();
			q.setNext(p);
			p.setNext(null);
		}
	}

	public void printLinkedList() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}

	private void deleteNode(int position) {
		Node temp = this.head;
		for (int i = 1; i < position - 1; i++) {
			temp = temp.getNext();
		}
		Node temp2 = temp.getNext();
		temp.setNext(temp2.getNext());
		temp2 = null;
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
