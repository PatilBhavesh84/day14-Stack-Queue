package com.BridgeLabz;

public  class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public static void main(String[] args) {	        
		System.out.println("New Queue ");
		Enqueue queue = new Enqueue();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.printQueue();
	}



}
