package com.ds;


public class LinkList {

	Node head;
	class Node{
		Node next;
		int data;
		//constructor
		public Node(int data) {
			super();
			this.next = null;
			this.data = data;
		}
	}
	//method to insert data in LinkList
	public Node insert(int data) {
		Node newNode= new Node(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node temp = head;
			while (temp.next!= null)
			{
				temp =temp.next;
			}
			temp.next = newNode;
		}
		return newNode;
	}
	
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}
}
