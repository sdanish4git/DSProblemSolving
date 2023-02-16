package string;

public class NumberofLinesToWriteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int widths[] = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}; 
		String s = "abcdefghijklmnopqrstuvwxyz";
		int res[]=new NumberofLinesToWriteString().numberOfLines(widths, s);
		System.out.println(res[0]+"  "+res[1]);

	}
	public int[] numberOfLines(int[] widths, String s) {
        int res[]=new int[2];
        int maxPix=100;
        int lines=1;
        int currPix=0;
        
        for(int i=0;i<s.length();i++) {
        	char c=s.charAt(i);
        	int pix=widths[c-'a'];
        	currPix +=pix;
        	if(currPix<=maxPix) {
        		continue;
        	}else {
        		lines++;
        		currPix=pix;
        	}
        }
        res[0]=lines;
        res[1]=currPix;
        
        return res;
    }

}
