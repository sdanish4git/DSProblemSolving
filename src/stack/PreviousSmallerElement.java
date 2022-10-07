package stack;

import java.util.Stack;

public class PreviousSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,10,5,18,3,12,7};
		int output[]=new int[a.length];
		
		bruteForce(a, output);
		usingStack(a);
		
		
		for(int e:output) {
			System.out.print(e+" ");
		}

	}

	private static void usingStack(int[] a) {
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<a.length;i++) {
			
			while(!stack.empty() && stack.peek() >= a[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				System.out.print("-1 ");
			}else {
				System.out.print(stack.peek()+" ");
			}
			stack.push(a[i]);
				
		}
	}

	private static void bruteForce(int[] a, int[] output) {
		for(int i=0;i<a.length;i++) {
			int smallerElement=-1;
			for(int j=i-1;j>=0;j--) {
				if(a[i]>a[j]) {
					smallerElement=a[j];
					break;
				}
			}
			output[i]=smallerElement;
			
		}
	}

}
