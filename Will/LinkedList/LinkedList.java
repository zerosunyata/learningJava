

public class LinkedList {
 private Node head = new Node();
 private Node tail = new Node();
 
 public LinkedList() {
	 this (null,null);
	 
 }
 public LinkedList(Node head) {
	 this.head = head;
	 System.out.print(head);
 }
 public LinkedList (String data, Node next) {
	 this.head.data = data;
	 this.head.next = next;
	 this.tail.Data = data;
	 this.tail.next = next;
	 System.out.print(head);
 }
 
 public void addHead(String data) {
	 Node node = new Node(data, null);
	 this.head.next = node;
	 Node p = head.next;
	 if(p == null)
		 this.head.next = node;
	 	 this.tail.next = node;
	 else {
		 node.next = p;
		 this.head.next = node;
	 }
	 
	 public void push(String data) {
		 addHead(data);
	 }
	 
	 public void addTail(String data) {
		 Node node = new Node(data, null);
		 Node p = tail.next;
		 if(p == null) {
			 this.head.next = node;
			 this.tail.next=node;
		 }else {
			 p.next = node;
			 this.tail.next = node;
		 }
	 }
	 tail = temp;
	 
	 tail.next = node;
 }
	 @Override
	 public String toString() {
		 String returnString = "\n";
		 returnString += "LinkedList head:";
		 int i = 0;
		 if (head!= null) {
			 Node p = head.next;
			 while(p != null) {
				 returnString += "Node" + i + "Data" + head.data;
				 i ++;
			 }
			 
		 }
		 return returnString;
	}
	 
 }
