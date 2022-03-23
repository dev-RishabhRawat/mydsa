 package linkedlist;

import java.util.LinkedList;

public class MyLinkedList {
	// Properties
	Node head;
	int count;
	
	//Constructors
//	public LinkedList() {
//		head = null;
//		count = 0;
//	}
	public MyLinkedList(Node newHead) {
		head = newHead;
		count = 1;
	}
	
	//Methods
	
	//add
	public void add (int newData) {
		Node temp = new Node(newData);
		Node current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
		
	}
	//get
	
	public int get(int index) {
		if(index <= 0) {
			return -1;
		}
		Node current = head;
		for(int i=1; i<index; i++) {
			current = current.getNext();
		}
		return current.getData();
		
	}
	
	//size
	public int size() {
		return count;
	}
	//isEmpty
	public boolean isEmpty() {
		return head == null;
	}

	
	//remove
	
	public void remove() {
		Node current = head;
		while(current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
		count--;
	}
	public static void main(String[] args) {
		LinkedList<String>  ll  = new LinkedList<String>();
		ll.add("hello");
		System.out.println(ll);
		ll.add("second");
		System.out.println(ll);
		ll.add("third");
		System.out.println(ll);
		ll.add("fourth");
		System.out.println(ll);
		ll.add(2,"fifth");
		System.out.println(ll);
	}

}
 