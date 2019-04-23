package com.datastructures.stack;

public class Stack {

	private int top = -1;

	private final int MAX_SIZE = 10;

	private int ar[] = new int[MAX_SIZE];

	public void push(int data) {
		if (top == MAX_SIZE - 1) {
			System.out.println("Stack overflow");
			return;
		}
		ar[++top] = data;
	}

	public int pop() {
		if (top == -1) {
			System.out.println("Stack empty");
			return -1;
		}
		int data = ar[top];
		top--;
		return data;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == MAX_SIZE - 1;
	}

}
