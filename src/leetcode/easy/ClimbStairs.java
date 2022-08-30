package leetcode.easy;

public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairsRec(5));
	}
	
	public static int climbStairsRec(int n) {
		if(n<=1) return 1;
		int way1=climbStairs(n-1);
		int way2=climbStairs(n-2);
		return way1+way2;
	}
	 public static int climbStairs(int n) {
	        
	        if(n<=1) return 1;
	        int ways[]=new int[n+1];
	        ways[0]=1;
	        ways[1]=1;
	        for(int i=2;i<=n;i++){
	            ways[i]=ways[i-2] + ways[i-1];
	            
	        }
	        return ways[n];
	    }

}
