package com.datastructures.linkedlist.singly;

public class Demo {

	public static void main(String[] args) {

		LinkedList linkedList = getLinkedList();
		linkedList.add(new Node(4));
		System.out.print("Original List: ");
		linkedList.printLinkedList();
		System.out.println();
		System.out.print("After deleteing the node at 1st position, List: ");
		linkedList.delete(1);
		linkedList.printLinkedList();
		System.out.println();
		System.out.print("After reversing, List: ");
		linkedList.reverse();
		linkedList.printLinkedList();
		System.out.println();
		System.out.print("reverse print, List: ");
		linkedList.reversePrint(linkedList.head);
		linkedList.reverse(linkedList.head);
		System.out.println();
		System.out.print("reverse, List: ");
		linkedList.printLinkedList();

	}

	private static LinkedList getLinkedList() {
		LinkedList linkedList = new LinkedList();
		Node node1 = new Node(1);
		linkedList.head = node1;

		Node node2 = new Node(2);
		node1.setNext(node2);

		Node node3 = new Node(3);
		node2.setNext(node3);
		return linkedList;
	}
}
