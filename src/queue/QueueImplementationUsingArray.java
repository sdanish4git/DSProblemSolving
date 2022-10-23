package queue;

import javax.management.RuntimeErrorException;

public class QueueImplementationUsingArray {
	
	int a[];
	int rear=-1;
	public QueueImplementationUsingArray(int size) {
		a=new int[size];
	}
	
	public void enqueue(int data) {
		if(rear == a.length-1) {
			throw new RuntimeException("OverFlow");
		}
		a[++rear]=data;
		
	}
	
	public int dequeue() {
		if(rear ==-1) throw new RuntimeException("UnderFlow");
		int res=a[0];
		for(int i=0;i<rear;i++) {
			a[i]=a[i+1];
		}
		--rear;
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImplementationUsingArray queue=new QueueImplementationUsingArray(5);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(3);
		queue.enqueue(2);
		queue.enqueue(1);
		queue.dequeue();
		for(int e:queue.a) {
			System.out.println(e);
		}
	}

}
