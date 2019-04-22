package com.datastructures.linked_list;

public class Demo {

    public static void main(String[] args) {
        //LinkedList linkedList = getLinkedList();
        LinkedList linkedList = new LinkedList();
        Node node = new Node(4);
        linkedList.add(1, node);
        printLinkedList(linkedList.head);

    }

    private static void addNodeAtTheBeginning(LinkedList linkedList, Node node) {
        Node head = linkedList.head;
        linkedList.head = node;
        node.setNext(head);
    }

    private static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
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
