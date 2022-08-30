package leetcode.easy;

public class StrStrProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack="hello";
		String needle="lo";
		int index=-1;
		for(int i=0;i<haystack.length()-needle.length()+1;i++) {
			if(haystack.charAt(i)==needle.charAt(0)) {
				if(haystack.substring(i,needle.length()+i).equals(needle)) {
					index=i;
					
				}
			}
		}
		
		System.out.println(index);
	}

}
