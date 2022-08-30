package array;

public class BuyAndSell1 {
	//find maxProfile, while doing buy and sell
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,1,4,8,7,2,5};
		int maxProfit=0;
		//maxProfit = bruteForce(a); //O(n^2)  O(1)
		//maxProfit = usingSpace(a, maxProfit);//  O(n)  O(n)
		maxProfit = optimized(a, maxProfit); // O(n)   O(1)
		
		
		System.out.println(maxProfit);
	}

	private static int optimized(int[] a, int maxProfit) {
		int minBuySofar=a[0];
		for(int i=0;i<a.length;i++) {
			if(minBuySofar>a[i]) {
				minBuySofar=a[i];
			}
			if(maxProfit<a[i]-minBuySofar) {
				maxProfit=a[i]-minBuySofar;
			}
		}
		return maxProfit;
	}

	private static int usingSpace(int[] a, int maxProfit) {
		int aux[]=new int[a.length];
		int maxSell=0;
		
		for(int i=a.length-1;i>=0;i--) {
			if(maxSell<a[i]) {
				maxSell=a[i];
			}
			aux[i]=maxSell;
		}
		for(int i=0;i<a.length;i++) {
			if(maxProfit<aux[i]-a[i]) {
				maxProfit=aux[i]-a[i];
			}
		}
		return maxProfit;
	}

	private static int bruteForce(int[] a) {
		int maxProfit=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]-a[i]>maxProfit) {
					maxProfit=a[j]-a[i];
				}
			}
		}
		return maxProfit;
	}

}
