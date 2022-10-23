package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingStack {
	Deque<Integer> stack1=new ArrayDeque<Integer>();
	Deque<Integer> stack2=new ArrayDeque<Integer>();
	
	public void enqueue(int data) {
		stack1.push(data);
	}
	
	public int dequeu() {
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		int res=stack2.pop();
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		return res;
	}

	public static void main(String[] args) {
		

	}

}
