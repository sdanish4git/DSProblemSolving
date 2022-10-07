package linkedlist;

public class SinglyLinkedList {
	
	Node head;
	
	public void insert(int data) {
		if(head==null) {
			head=new Node(data);
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=new Node(data);
	}
	
	public void insertAtPosition(int data,int pos) {
		Node newNode=new Node(data);
		if(pos==0) {
			newNode.next=head;
			head=newNode;
			return;
		}
		Node prev=head;
		for(int i=0;i<pos-1;i++) {
			prev=prev.next;
		}
		newNode.next=prev.next;
		prev.next=newNode;
	}
	
	public void deleteAtPos(int pos) {
		if(pos==0) {
			head=head.next;
			return;
		}
		Node prev=head;
		for(int i=0;i<pos-1;i++) {
			prev=prev.next;
		}
		prev.next=prev.next.next;
		
	}
	
	public void reverseList() {
		Node prev=null;
		Node curr=head;
		while(curr!=null) {
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		head=prev;
	}
	
	public void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
			
		}
		System.out.println();
	}

}
