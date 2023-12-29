import Linked_List.First_Last_Node.Node;

public class Singly_Linked_list {
	class Node{
		int data;
		Node next;
		 public Node(int data) {
			 this.data=data;
			 this.next=null;
		 }
	}
	 public Node head = null;
	 public Node tail = null;
	 void addNode(int data){
		 Node newNode = new Node(data);
		 if(head==null) {
			 head=newNode;
		     tail=newNode;
}
	     else {
	    	 tail.next=newNode;
	    	 tail=newNode;
	 }
}
	 void addBeginning(int data) {
		 Node newNode = new Node(data);
		 if(head==null) {
			 head=newNode;
			 tail=newNode;
		 }
		 else {
			 newNode.next=head;
			 head=newNode;
		 }
	 }
	 void addLast(int data) {
		 Node newNode = new Node(data);
		 Node current=head;
		 if(head==null) {
			 head=newNode;
			 tail=newNode;
		 }
		 else {
			 while(current.next!=null) {
				 current=current.next;
			 }
			 current.next=newNode;
			 tail=newNode;
		 }
	 }
	 public void deleteFirst() {
		//Node temp=head;
		 if(head == null)
			 System.out.println("List is empty");
		 else {
			 head=head.next;
		 }
	 }
	 public void deleteLast() {
			Node temp = head;
			if(head == null)
				 System.out.println("Linked list is empty");	
		else {
			while(temp.next!=tail) {
				temp=temp.next;
			}
		}
		temp.next=null;
		tail=temp;
	}
	 void addBetween(int pos,int data) {//pos=20,data=78
		 Node newNode=new Node(data);
		 Node current=head;
		 if(head==null) {
			 head=newNode;
			 tail=newNode;
		 }
		 else {
			 while(current.data!=pos) {
				 current=current.next;
			 }
			 newNode.next=current.next;
			 current.next=newNode;
		 }
	 }
	 public void deleteElement(int data) {
		 Node temp = head;
		 if(head==null)
			 System.out.println("List is empty");
		 else {
			 if(temp.data==data) {
				 temp=temp.next;
				 head=temp;
			 }
				 else {
					 while(temp.next.data!=data) {
						 temp=temp.next;
					 }
					 if(temp.next==null)
						 System.out.println("Elements is not present in the list");
					 else {
						 temp.next=temp.next.next;
				 }
			 }
		 }
	 }
	 public void display() {
		 Node current = head;
		 if(head==null) {
			 System.out.println("Linked List is empty");
			 }
		 else {
		 System.out.println("Singly Linked list elements are: ");
		 while(current!=null) {
			 System.out.print(current.data+" ");
			 current=current.next;
		 }
	 }
 }

	public static void main(String[] args) {
		Singly_Linked_list sll = new Singly_Linked_list();
		   sll.addNode(2);
		   sll.addNode(4);
		   sll.addBeginning(6);
		   sll.addLast(10);
		   sll.addNode(12);
		   sll.addBetween(4, 24);
		   sll.display(); 
		   sll.deleteElement(4);
		   sll.deleteFirst();
		   sll.deleteLast();
		   sll.display();

		   
	}

}
