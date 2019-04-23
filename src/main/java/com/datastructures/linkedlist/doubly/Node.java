package com.datastructures.linkedlist.doubly;

public class Node {

	private int data;

	private Node next;

	private Node prev;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
