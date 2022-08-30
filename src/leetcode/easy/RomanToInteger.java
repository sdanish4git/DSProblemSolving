package leetcode.easy;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToNumber("VII"));
	}
	
	public static int romanToNumber(String input) {
		HashMap<Character,Integer> hm=new HashMap<>();
		hm.put('I', 1);
		hm.put('V',5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C',100);
		hm.put('D', 500);
		hm.put('M', 1000);
		int result=hm.get(input.charAt(input.length()-1));
		for(int i=input.length()-2;i>=0;i--) {
			if(hm.get(input.charAt(i))<hm.get(input.charAt(i+1))) {
				result=result-hm.get(input.charAt(i));
			}else {
				result=result+hm.get(input.charAt(i));
			}
		}
		return result;
	}

}
