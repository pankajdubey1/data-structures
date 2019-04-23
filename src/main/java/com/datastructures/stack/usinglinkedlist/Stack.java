package com.datastructures.stack.usinglinkedlist;

public class Stack {

	private LinkedList list = new LinkedList();

	public void push(int data) {
		list.insertAtBeginning(data);
	}

	public int pop() {
		if (list.head == null) {
			System.out.println("Stack empty");
			return -1;
		}
		return list.deleteFromBeginning();
	}

	public boolean isEmpty() {
		return list.head == null;
	}

}
