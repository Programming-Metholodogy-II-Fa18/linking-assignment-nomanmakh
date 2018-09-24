package Assignment1package;

import Assignment1package.Node;

class Node{   
	int data;
	Node next;
	Node prev;
	public Node(int data) { 
		this.data = data;
		next = null;
		prev = null;
	}

	
}

public class Stack{
	
	public Node head;
	public Node past_peek_head;
	
	public Stack() {
		this.head = null;
		this.past_peek_head = null;
	}
	
	public void push(int item){
		if (head == null) { // the arbitrary queue is empty
			Node first = new Node(item);
			head = first;
		}
		// if it is not empty you push to the front (i.e head)
		Node new_head = new Node(item);
		head.prev = new_head;
		new_head.next = head;
		head = new_head;
		
	}
	public int pop()
	{
		if (head == null)
		{
			System.out.println("empty");
			return -1;
		}
		int oldhead = head.data;
		head = head.next;
		head.prev = null;
		return oldhead;
	}
	public int peek() {
		return head.data;
	}
	public void insertionSort() {
		if(head == null){
			System.out.println("empty");
			
		}
		update();
		Node ptr = head.next;
		while(ptr.next != null) {
			int ptrData = ptr.data;
			int ptr2Data = ptr.prev.data;
			if(ptr2Data>ptrData) {
				
				int temp = ptrData;
				ptr.data = ptr2Data;
				ptr.prev.data = temp;
				Node ptrtemp = ptr.prev;
				System.out.println("swapping " + ptrData +"with "+ptr2Data);
				while(ptrtemp.prev != null) {
					int ptrtempData = ptrtemp.data;
					int ptrtemp2Data = ptrtemp.prev.data;
					if(ptrtemp2Data>ptrtempData) {
						int temp2 = ptrtempData;
						ptrtemp.data = ptrtemp2Data;
						ptrtemp.prev.data = temp2;
						System.out.println("swapping " + ptrtempData +"with "+ptrtemp2Data);
					}
					else {
						break;
					}
					ptrtemp=ptrtemp.prev;
				}
				
				
			}
			ptr = ptr.next;
		}
		Node ptrr = head;
		while(ptrr.next != null) {		
			System.out.print(ptrr.data+ " ");
			ptrr=ptrr.next;
		}
	}
	
	private void update(){
		Node temp = head;
		Node new_head = null;
		Node temp2 = new_head;
		while(temp != null) {
			temp2 = new Node(temp.data);
			temp2 = temp2.next;
			temp = temp.next;
		}
		past_peek_head = new_head;
				
	}
	
	public int pastpeek() {
		return past_peek_head.data;
	}
	
}

	
	
