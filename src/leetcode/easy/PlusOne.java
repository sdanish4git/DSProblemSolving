package leetcode.easy;

import util.ArrayUtil;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digits[] = {9,9,9};//{1,2,3}
		System.out.println(105/10);// 100 
		//plusOneSol1(digits);
		ArrayUtil.printArray(plusOneSol2(digits));
		
	}
	private static int[] plusOneSol2(int[] digits) {
		
		for(int i=digits.length-1;i>=0;i--) {
			 if(digits[i]<9) {
				 digits[i]++;
				return digits;
			 }
			 digits[i]=0;
			 
		}
		int newNumber[]=new int[digits.length+1];
		newNumber[0]=1;
		return newNumber;
		
	}
	private static void plusOneSol1(int[] digits) {
		boolean carry=false;
		for(int i=digits.length-1;i>=0;i--) {
			if(carry) {
				if(digits[i]!=9) {
					digits[i] +=1;
					carry=false;
					break;
				}else {
					digits[i]=0;
				}
			}else {
				if(digits[i]!=9) {
					digits[i] +=1;
					break;
				}else {
					digits[i]=0;
					carry=true;
				}
			}
		}
		
		if(carry) {
			int b[]=new int[digits.length+1];
			b[0]=1;
			System.arraycopy(digits, 0,b ,1, digits.length);
			ArrayUtil.printArray(b);
		}else {
			ArrayUtil.printArray(digits);
		}
	}
	
}
