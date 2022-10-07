package queue;

public class QueueImplementUsingLinkedList {
	Node front;
	Node rear;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImplementUsingLinkedList queue=new QueueImplementUsingLinkedList();
		queue.enqueue(4);
		queue.enqueue(6);
		queue.enqueue(8);
		queue.dequeue();
		queue.printQueue();
	}
	public void printQueue() {
		Node temp=front;
		while(temp!=null) {
			System.out.print(temp.data+ "->");
			temp=temp.next;
		}
	}
	public void enqueue(int data) {
		Node newNode=new Node(data);
		if(front == null) {
			front=rear=newNode;
			return;
		}
		rear.next=newNode;
		rear=newNode;
		
	}
	
	public int dequeue() {
		if(front==null) return -1;
		int data=front.data;
		front=front.next;
		return data;
	}
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
}
