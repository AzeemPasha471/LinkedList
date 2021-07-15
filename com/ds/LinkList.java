package com.ds;

public class LinkList {

	Node head;

	class Node {
		Node next;
		int data;

		// constructor
		public Node(int data) {
			super();
			this.next = null;
			this.data = data;
		}
	}

	// method to append data(insert at last position)
	public Node insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return newNode;
	}

	// method to push
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// method to insert at particular position
	public void addAtIndex(int value, int index) {
		if (index == 0) {
			insert(value);
		} else {
			Node newNode = new Node(value);
			// newNode.value = value;
			Node nodeAtPreviousIndex = head;
			for (int i = 0; i < index - 1; i++) {
				nodeAtPreviousIndex = nodeAtPreviousIndex.next;
			}
			newNode.next = nodeAtPreviousIndex.next;
			nodeAtPreviousIndex.next = newNode;
		}
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}
}
