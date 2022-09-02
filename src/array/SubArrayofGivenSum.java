package array;

import java.util.HashMap;

public class SubArrayofGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//solution1(); //O(n^2)
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int n = 10, s = 10;
		
		//twoPointer(a, n, s); // O(n) O(1)
		//bruteForce(a, s); //O(n^2)
		
		usingHashMap(a, s);//O(n) O(n)
		
		
		
	}

	private static void usingHashMap(int[] a, int s) {
		HashMap<Integer, Integer> hm=new HashMap<>();
		int currSum=0;
		int start=0;
		int end=0;
		for(int i=0;i<a.length;i++) {
			currSum +=a[i];
			if(currSum-s==0) {
				start=0;
				end=i;
			}
			if(hm.containsKey(currSum-s)) {
				start=hm.get(currSum-s);
				end=i;
				break;
			}else {
				hm.put(currSum-s, i);
			}
			
		}
		System.out.println((start+1)+"  "+(end+1));
	}

	private static void bruteForce(int[] a, int s) {
		int sum=0;
		int start=0;
		int end=0;
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			sum=a[i];
			for(int j=i+1;j<a.length;j++) {
				
				sum=sum+a[j];
				if(sum==s) {
					start=i;
					end=j;
					System.out.println((start+1)+"  "+(end+1));
					found=true;
					break;
				}
			}
			if(found) break;
			sum=0;
		}
	}

	private static void twoPointer(int[] a, int n, int s) {
		int left=0;
		int right=0;
		int sum=0;
		while(right<n) {
			
			if(sum==s) {
				System.out.println((left+1)+" "+(right));
				break;
			}
			if(sum<s) {
				sum=sum+a[right];
				right++;
			}else {
				
				sum=sum-a[left];
				left++;
				
			}
		}
	}

	private static void solution1() {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		 int n = 10, s = 15;
		int start=0;
		int end=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				sum=sum+a[j];
				if(sum==s) {
					start=i+1;
					end=j+1;
					i=n;
				}
			}
			sum=0;
		}
		System.out.println(start+"  "+end);
	}

}
