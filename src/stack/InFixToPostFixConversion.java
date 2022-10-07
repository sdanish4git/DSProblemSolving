package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class InFixToPostFixConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "a+b*d-i";
		System.out.println(infixToPost(exp));
		

	}
	
	public static String infixToPost(String expression) {
		String output=new String("");
		Deque<Character> stack=new ArrayDeque<>();
		for(int i=0;i<expression.length();i++) {
			char c=expression.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				output +=c;
				
			}else if(c == '(') {
				stack.push(c);
			}else if(c == ')') {
				while(!stack.isEmpty() && stack.peek()!='(') {
					output +=stack.peek();
					stack.pop();
				}
				stack.pop();
			}else {
				while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
					output +=stack.peek();
					stack.pop();
				}
				stack.push(c);
			}
			
		}
		while(!stack.isEmpty()) {
			output +=stack.pop();
		}
		return output;
	}
	
	public static int precedence(char c) {
		switch(c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
			
	}

}
