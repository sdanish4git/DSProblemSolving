package binarysearch;

public class LargestElementInIncreasingAndDecreasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,9,15,25,35,75,50,61,29,23,8};
		System.out.println(findLargest(a, 0, a.length-1));
	}
	
	public static int findLargest(int a[],int start,int end) {
		if(start==end) {
			return a[start];
		}
		int mid=(start+end)/2;
		if(a[mid]>a[mid+1] && a[mid] > a[mid-1]) {
			return a[mid];
		}
		if(a[mid]>a[mid-1]) {
			return findLargest(a,mid+1,end);
		}else {
			return findLargest(a,start,mid-1);
		}
	}

}
