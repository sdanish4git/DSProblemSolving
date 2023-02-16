package string;

import java.util.ArrayList;

public class KeyBoardRow {
	
	public static void main(String[] args) {
		String words[]= {"Hello","Alaska","Dad","Peace"};
		String res[]=new KeyBoardRow().findWords(words);
		for(String r:res) {
			System.out.println(r);
		}
	}
    public String[] findWords(String[] words) {

        String firstRow="qwertyuiop";
        String secondRow="asdfghjkl";
        String thirdRow="zxcvbnm";

        String inRow="";
        ArrayList<String> output=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i].toLowerCase();
            if(firstRow.indexOf(word.charAt(0))!=-1){
                inRow=firstRow;
            }else if(secondRow.indexOf(word.charAt(0))!=-1){
                inRow=secondRow;
            }else if(thirdRow.indexOf(word.charAt(0))!=-1){
                inRow=thirdRow;
            }
            boolean isTyped=true;
            for(int j=1;j<word.length();j++){
                if(inRow.indexOf(word.charAt(j)) == -1){
                    isTyped=false;
                    break;
                }
            
            }
            if(isTyped){
                output.add(words[i]);
            }
            
        }
        String res[]=new String[output.size()];
           output.toArray(res);
            return res;
        
    }
}