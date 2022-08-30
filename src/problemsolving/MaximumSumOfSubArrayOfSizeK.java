package problemsolving;

//SlidingWindow Problem
public class MaximumSumOfSubArrayOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,1,8,2,9,1};
		int k=3;//Window
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		int i=0;
		int j=0;
		while(j<a.length) {
			if(j<k) {
				sum=sum+a[j++];
			}else {
				sum=sum-a[i++]+a[j++];
				if(sum>maxSum) maxSum=sum;
			}
			
		}
		System.out.println("test "+maxSum);
		
	}

}
