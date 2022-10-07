package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="{(())}";
		
		System.out.println(isValidParenthesis(input));
			
			
		}
	

	public static boolean isValidParenthesis(String input) {
		Deque<Character> stack=new ArrayDeque<Character>();
		for(char c:input.toCharArray()) {
			if(isOpeningBracket(c)) {
				stack.push(c);
			}else {
				if(stack.isEmpty()) {
					return false;
				}else if(!isMatching(stack.peek(),c)) {
					return false;
				}else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty();
	}
	private static boolean isMatching(Character a, char c) {
		// TODO Auto-generated method stub
		return (a == '(' && c==')') || (a == '{' && c=='}') || (a == '[' && c==']');
	}
	private static boolean isOpeningBracket(char c) {
		// TODO Auto-generated method stub
		return c == '(' || c== '{' || c== '[';
	}

}
