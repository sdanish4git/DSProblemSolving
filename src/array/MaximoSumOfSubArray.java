package array;

public class MaximoSumOfSubArray {

	public static void main(String[] args) {
		int a[]= {-5,4,6,-3,4,-1};
		//int max = bruteForce(a);
		
		//int maxSum = kadanesAlogrithm(a);
		int maxSum=Integer.MIN_VALUE;
		int soFarSum=0;
		for(int i=0;i<a.length;i++) {
			soFarSum=soFarSum+a[i];
			if(soFarSum<a[i]) {
				soFarSum=a[i];
			}
			if(maxSum<soFarSum) {
				maxSum=soFarSum;
			}
		}
		System.out.println(maxSum);
		//System.out.println("maxsum="+max);
	}

	private static int kadanesAlogrithm(int[] a) {
		int maxSum=Integer.MIN_VALUE;
		int soFarSum=0;
		for(int i=0;i<a.length;i++) {
			soFarSum=soFarSum+a[i];
			if(maxSum<soFarSum) {
				maxSum=soFarSum;
			}
			if(soFarSum<0) {
				soFarSum=0;
			}
		}
		return maxSum;
	}

	private static int bruteForce(int[] a) {
		int max=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				sum=sum+a[j];
				if(sum>max) {
					max=sum;
				}
			}
			sum=0;
		}
		return max;
	}
}
