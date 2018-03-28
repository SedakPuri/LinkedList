/*Sedak Puri
 * Introduction to CS 3
 * Lab01
 */
public class SinglyLinkedList {
	private Node head;
	private int size;
	
	
	public SinglyLinkedList() {
		head = null;
		size = 0;
	}

	//Inner class for each node
	public class Node
	{
		private Node next;
		private int value;
		
		public Node(int v, Node n) {
			this.next = n;
			this.value = v;
		}
		
		public String toString() {
			return "" + value;
		}
	}
	
	//toString method to print the list
	public String toString() {
		//If the list is empty
		if (head == null) {
			return "List is empty";
		}
		
		//Invoking the toString method for each individual node and storing it in a string variable
		String list = "";
		Node temp = head;
		while(temp != null)
		{
			list += temp.toString() + " ";
			temp = temp.next;
		}
		return list;
	}
	
	public void insertAtHead(int v) {
		//Creating new node that points to head of next node
		Node newNode = new Node(v, head);
		//Sets the head (0th) pointer to newest node
		head = newNode;
		size++;
	}
	
	//Method to remove the head node
	public int removeHead()
	{
		if (head == null) {
			throw new IllegalStateException("List is empty");
		}
		
		//Stores value of head node and sets node reference to next node
		int value = head.value;
		head = head.next;
		size--;
		
		return value;
	}
	
	//Method to find minimum of a linkedlist
	public int min() {
		//If the list is empty
		if (head == null) {
			throw new IllegalStateException("List is empty");
		}
		
		int minimum = head.value;
		Node temp = head;
		//For loop to find minimum value
		for(int i = 0; i < size; i++) {
			if(temp.value < minimum) {
				minimum = temp.value;
			}
			temp = temp.next;
		}
		return minimum;
	}
	
	//Method to find the max value in a linkedlist
	public int max() {
		//If the list is empty
		if (head == null) {
			throw new IllegalStateException("List is empty");
		}
		
		int maximum = head.value; 
		Node temp = head;
		//For loop to fine the maximum value
		for (int i = 0; i < size; i++) {
			if (temp.value > maximum) {
				maximum = temp.value;
			}
			temp = temp.next;
		}
		return maximum;
	}
	
	//Method to remove the last node of a linkedlist
	public int removeLast() {
		//Handles if List is empty
		int lastValue = 0; //Making the compiler happy :)
		if (head == null) {
			throw new IllegalStateException("List is empty");
		}
		
		//Handles if the list only contains one element
		if(head.next == null) {
			lastValue = head.value;
			head = null;
			return lastValue;
		}
		
		//Handles if the list is longer than one element
		Node temp = head;
		while(temp.next.next != null) {	//Checks the reference of the next node (skipping ahead)
			temp = temp.next;
			if (temp.next.next == null) {
				lastValue = temp.next.value;
				temp.next = null;	//Effectively deleting the last reference to last node
				size--;
				return lastValue;
			}
		}
		return lastValue;
	}
}
