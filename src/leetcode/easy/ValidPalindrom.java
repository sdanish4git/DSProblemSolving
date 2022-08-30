package leetcode.easy;

/*
 * A phrase is a palindrome if, 
 * after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
 * it reads the same forward and backward. 
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */
public class ValidPalindrom {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab_a";
		s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		StringBuilder s1=new StringBuilder(s);
		String reverseStr=s1.reverse().toString();
		System.out.println(reverseStr);
		System.out.println(s.equals(reverseStr));
	}
	
	 public boolean isPalindrome(String s) {
	        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        
	        int l=0;
	        int r=s.length()-1;
	        while(l<=r) {
		        	if(s.charAt(l)!=s.charAt(r)) {
		        		return false;
		        	}
		        	r--;
		        	l++;
		        }
	        
			return true;
	    }

}
