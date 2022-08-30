package leetcode.easy;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(26));
	}

	public static String convertToTitle(int columnNumber) {
		StringBuilder sb = new StringBuilder();
        while(columnNumber > 0) {
            int rem = columnNumber%26;
            columnNumber = columnNumber/26;
            if(rem == 0){
                rem = 26;
                columnNumber-=1;
            }
            sb.insert(0,(char)(rem+('A'-1)));
        }
        
        return sb.toString();
	}

}
