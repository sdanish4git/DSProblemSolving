package queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackImplementationUsingQueue {
	Deque<Integer> queue=new LinkedList<>();
	Deque<Integer> tempQueue=new LinkedList<>();
	
	public void push(int data) {
		while(!queue.isEmpty()) {
			tempQueue.offer(queue.poll());
		}
		queue.offer(data);
		while(!tempQueue.isEmpty()) {
			queue.offer(tempQueue.poll());
		}
	}
	
	public int pop() {
		return queue.poll();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
