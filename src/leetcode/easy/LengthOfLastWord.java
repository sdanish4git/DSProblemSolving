package leetcode.easy;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="   fly me   to   the moon  ";
		
		System.out.println(sol1(s));
		

	}
	public static int sol1(String s) {
		int n=s.trim().length();
		
		
		return n-(s.trim().lastIndexOf(" ")+1);
	}
	public static int sol2(String s) {
		int index=s.length()-1;
		while(index>=0 && !Character.isLetter(s.charAt(index))) {
			index--;
		}
		int lengthOfWord=0;
		while(index>=0 && Character.isLetter(s.charAt(index))) {
			lengthOfWord++;
			index--;
		}
		return lengthOfWord;
	}

}
