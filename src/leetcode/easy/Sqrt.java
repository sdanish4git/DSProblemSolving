package leetcode.easy;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrtBinary(10));
	}
	public static int mySqrtBinary(int x) {
		int low=1;
		int high=x;
		int ans=-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			int sqrt=mid*mid;
			if(sqrt==x) {
				return mid;
			}else if(sqrt<x) {
				ans=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
			
		}
		return ans;
	}
	public static int mySqrt(int x) {
	    long answer=0;
	    if(x < 2)
	        return x;
	    for(long i=1;i*i<=x;i++)
	            answer=i;   
	    return (int)answer;
	}

}
