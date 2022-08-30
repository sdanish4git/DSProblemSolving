package problemsolving;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,3,0,0,0};
		int m = 3;
		int nums2[] = {2,5,6};
		int n = 3;
		merge(nums1,m,nums2,n);
		for(int num:nums1) {
			System.out.print(num+" ");
		}
		
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1=m-1,p2=n-1,i=m+n-1;
		
		while(p2>=0) {
			if(p1>=0 && nums1[p1]>nums2[p2]) {
				nums1[i--]=nums1[p1--];
			}else {
				nums1[i--]=nums2[p2--];
			}
		}
    }
	
	/*public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if(n==0) return;
		//if(n>=m) return;
		int k=0;
		for(int i=m;i<nums1.length;i++) {
			nums1[i]=nums2[k++];
		}
		
        Arrays.sort(nums1);
    }*/

}
