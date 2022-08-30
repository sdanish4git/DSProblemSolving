package leetcode.easy;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		titleToNumber("ZY");
	}
    
    public static int titleToNumber(String columnTitle) {
        
         int i=0, n = columnTitle.length(), result=0;
         int countOfAlphabet = 26;   
        while ( i<n){
            
            // Main Formula to remenber 
            //Tried To map out the formula from this example.
//             For a title “LEET”:

//                     L = 12
//                     E = (12 x 26) + 5 = 317
//                     E = (317 x 26) + 5 = 8247
//                     T = (8247 x 26) + 20 = 214442
                        
            result = (result * countOfAlphabet) + (columnTitle.charAt(i)-'A'+1);    
            // result is initialized as 0 therefore in the first iteration letter value will be added,
            //it will not n=be multipled by the countOfAlphabet
            i++;
            
        }
        
        return result;
    }

}
