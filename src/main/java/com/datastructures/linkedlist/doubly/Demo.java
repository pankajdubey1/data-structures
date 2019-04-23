package com.datastructures.linkedlist.doubly;

public class Demo {

	public static void main(String[] args) {

		DoublyLinkedList list = getLinkedList();
		System.out.print("Original list: ");
		list.printList(list.head);
		list.insertAtHead(5);
		System.out.println();
		System.out.print("After adding one node in beginning, list: ");
		list.printList(list.head);

	}

	private static DoublyLinkedList getLinkedList() {
		DoublyLinkedList list = new DoublyLinkedList();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);

		node1.setNext(node2);
		node2.setNext(node3);
		node2.setPrev(node1);
		node3.setPrev(node2);
		list.head = node1;
		return list;
	}

}
