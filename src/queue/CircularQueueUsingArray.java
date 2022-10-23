package queue;

public class CircularQueueUsingArray {
	
	int a[];
	int front;
	int rear;
	int n;
	public CircularQueueUsingArray(int size) {
		a=new int[size];
		front=-1;
		rear=-1;
		n=size;
	}
	
	public void enqueue(int data) {
		if((front+1)%n == rear) return;
		if(front ==-1 ) front=0;
		rear=(rear+1)%n;
		a[rear]=data;
	}
	
	public int dequeue() {
		if(front ==-1) throw new RuntimeException();
		int res=a[front];
		if(front == rear) {
			front=rear=-1;
		}else {
			front=(front+1)%n;
		}
		return front;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
