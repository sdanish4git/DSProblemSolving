package leetcode.easy;

public class IntegerToRoman {
	
	 static int intCode[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
	 static String romanCode[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman2(15));
	}
	public static String intToRoman(int num) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<intCode.length;i++){
            while(num>=intCode[i]){
                num-=intCode[i];
                sb.append(romanCode[i]);
            }
        }
        return sb.toString();
        
        
    }
	
	public static String intToRoman2(int num) {
		StringBuilder output=new StringBuilder();
		while(num > 0)
		{
		    if(num >= 1000)
		    {
		        output.append("M");
		        num = num -1000;
		    }
		    else if(num >= 900)
		    {
		        output.append("CM");
		        num = num -900;
		    }
		    else if(num >= 500)
		    {
		        output.append("D");
		        num = num -500;
		    }
		    else if(num >= 400)
		    {
		        output.append("CD");
		        num = num -400;
		    }
		    else if(num >= 100)
		    {
		        output.append("C");
		        num = num -100;
		    }
		    else if(num >= 90)
		    {
		        output.append("XC");
		        num = num -90;
		    }
		    else if(num >= 50)
		    {
		        output.append("L");
		        num = num -50;
		    }
		    else if(num >= 40)
		    {
		        output.append("XL");
		        num = num -40;
		    }
		    else if(num >= 10)
		    {
		        output.append("X");
		        num = num -10;
		    }
		    else if(num >= 9)
		    {
		        output.append("IX");
		        num = num -9;
		    }
		    else if(num >= 5)
		    {
		        output.append("V");
		        num = num -5;
		    }
		    else if(num >= 4)
		    {
		        output.append("IV");
		        num = num -4;
		    }
		    else if(num >= 3)
		    {
		        output.append("III");
		        num = num -3;
		    }
		    else if(num >= 2)
		    {
		        output.append("II");
		        num = num -2;
		    }
		    else if(num >= 1)
		    {
		        output.append("I");
		        num = num -1;
		    }
		}
		return output.toString();
		
	}

}
