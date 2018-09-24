public class  ArbitraryQueueArray{
	int [] arr = new int[1];
	public ArbitraryQueueArray(){	
	}
	
	public void push(int item) {
		int [] arr2 = new int[arr.length + 1];
		int i = 0;
		int temp = arr2[0];
		arr[0]= item;
		for(i=1;i <= arr.length;i++) {
			arr2[i]=temp;
			temp = arr[i+1];
		}
		arr = arr2;
			
		
	}
	public int pop() {
		if (arr[0] == 0) {
			System.out.println("empty");
			return -1;
		}
		int i = 0;
		int temp = arr[0];
		int [] arr2 = new int[arr.length - 1];
		for(i=0;i<arr2.length;i++) {
			arr2[i]=arr[i+1];
		}
		arr= arr2;
		return temp;
	}
	public void enqueue(int item) {
		int i = 0;
		int [] arr2 = new int[arr.length+1];
		arr2[arr2.length]=item;
		for(i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		arr = arr2;
	}
	public int dequeue() {
		if (arr[0] == 0) {
			System.out.println("empty");
			return -1;
		}
		int i = 0;
		int [] arr2 = new int[arr.length-1];
		int temp = arr[arr.length];
		for(i=0;i<arr2.length;i++) {
			arr2[i]=arr[i];
		}
		arr = arr2;
		return temp;
		
		
	}
	public int traverse(int index) {
		return arr[index];
	}
	
}