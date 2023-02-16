package string;

public class ShortestCompletingWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String licensePlate = "1s3 PSt";
		String words[] = {"step","steps","stripe","stepple"};
		System.out.println(new ShortestCompletingWord().shortestCompletingWord(licensePlate, words));
	}
	 public String shortestCompletingWord(String licensePlate, String[] words) {
	     
		 StringBuilder sb=new StringBuilder();
		 for(int i=0;i<licensePlate.length();i++) {
			 Character c=licensePlate.charAt(i);
			 if(Character.isAlphabetic(c)) {
				 sb.append(c);
			 }
		 }
		 
		 int alp[]=new int[26];
		 String s=sb.toString().toLowerCase();
		 for(int i=0;i<s.length();i++) {
			 alp[s.charAt(i)-'a']++;
		 }
		 String targWord=null;
		 for(int i=0;i<words.length;i++) {
			 String currentWord=words[i].toLowerCase();
			 if(!isCompletingWord(currentWord,alp)) continue;
			 if(targWord == null ) {
				 targWord=currentWord;
			 }else if(targWord.length()>currentWord.length()) {
				 targWord=currentWord;
			 }
		 }
		 
		 
		 return targWord;
	 }
	 public boolean isCompletingWord(String word,int alp[]){
		 int w[]=new int[26];
		 for(int i=0;i<word.length();i++) {
			 w[word.charAt(i)-'a']++;
		 }
		 for(int i=0;i<26;i++) {
			 if(w[i]<alp[i]) return false;
		 }
		 return true;
	 }
}
