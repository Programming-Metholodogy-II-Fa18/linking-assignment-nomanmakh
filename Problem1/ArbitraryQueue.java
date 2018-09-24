class Node<T> {   
	T data;
	Node<T> next;
	Node<T> prevtail;
	public Node(T data) { 
		this.data = data;
		this.next = null;
		prevtail = null;
	}
	

	public String toString() {
		return data.toString();
	}
}



public class ArbitraryQueue{
	
	public Node head;
	public Node tail;
	public Node prevtail;
	
	public ArbitraryQueue() {
		head = null;
		tail = null;
		prevtail = null;
		
	}
	
	public void push(T item){
		if (head == null) { // the arbitrary queue is empty
			Node first = new Node(item);
			head = first;
			tail = head;
		}
		// if it is not empty you push to the front (i.e head)
		Node new_head = new Node(item);
		new_head.next = head;
		head = new_head;
		
	}
	public T pop()
	{
		if (head == null)
		{
			System.out.prTln("empty");
			return -1;
		}
		T oldhead = head.data;
		head = head.next;
		return oldhead;
	}
	public void enqueue(T item) {
		if (head == null) {
			Node first = new Node(item);
			head = first;
			tail = first;
		}
		Node last = new Node(item);
		prevtail = tail;
		tail = last;
		
	}
	public T dequeue() {
		if(head == null) {
			System.out.prTln("empty");
			return -1;
		}
		T tailT = tail.data;
		tail = prevtail;
		return tailT;
		
	}
	public T traverse(T index) {
		if (index == 0) {
			return head.data;
		}
		Node temp = head;
		while(index > 0) {
			temp = temp.next;
			index--;
		}
		return temp.data;
	}
	
	
}
