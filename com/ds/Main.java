package com.ds;

public class Main {
	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		linkList.push(70);
		linkList.push(30);
		linkList.push(56);
		System.out.println("LinkList:");
		linkList.print();
		// insert between index 2 and 3
		linkList.addAtIndex(78, 2);
		linkList.print();
		linkList.addAtIndex(90, 3);
		linkList.print();

	}
}
