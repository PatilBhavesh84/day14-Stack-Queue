package com.BridgeLabz;

class Dequeue {

	static Node head;
	public void enqueue(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = newNode;
		}
	}
	public void dequeue() {

		System.out.println("Dequeued element is " + head.data);
		head = head.next;
	}
	public void printQueue(){
		if (head == null) {
			System.out.println("Queue is empty.\n");
		} else {
			Node pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + " ");
				pointer = pointer.next;
			}
		}
	}
}






