package stack;

import java.util.ArrayList;

public class MyStack {
	
	ArrayList<Integer> list=new ArrayList<>();
	int min=Integer.MAX_VALUE;
	
	public void push(int val) {
		list.add(val);
		if(val<min) min=val;
	}
	public void pop() {
		list.get(list.size()-1);
		list.remove(list.size()-1);
	}
	public int peek() {
		return list.get(list.size()-1);
	}
	public void minElem() {
		return 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
