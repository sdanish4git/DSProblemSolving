package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,10,5,1,15,10,7,6};
		int ans[]=new int[a.length];
		
		Deque<Integer> stack=new ArrayDeque<>();
		for(int i=a.length-1;i>=0;i--) {
			
			while(!stack.isEmpty() && stack.peek()>=a[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i]=-1;
			}else {
				ans[i]=stack.peek();
			}
			stack.push(a[i]);
		}
		for(int e:ans) {
			System.out.print(e+" ");
		}
	}

}
