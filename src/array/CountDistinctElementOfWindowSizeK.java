package array;

import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctElementOfWindowSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,2,1,3,1,1,3};
		int k=4;
		brutForce(a,k);
		
		usingTwoPointerAndSpace(a, k); // O(n), O(1)
		
	}

	private static void usingTwoPointerAndSpace(int[] a, int k) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<k;i++) {
			hm.put(a[i],hm.getOrDefault(a[i], 0)+1);
		}
		System.out.println(hm.size());
		for(int i=k;i<a.length;i++) {
			if(hm.get(a[i-k])==1) {
				hm.remove(a[i-k]);
			}else if(hm.get(a[i-k]) > 0) {
				hm.put(a[i-k],hm.get(a[i-k])-1);
			}
			hm.put(a[i], hm.getOrDefault(a[i-k],0)+1);
			System.out.println(hm.size());
		}
	}

	private static void brutForce(int[] a,int k) {
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0;i<a.length-k+1;i++) {
			for(int j=i;j<i+4;j++) {
				hs.add(a[j]);
			}
			System.out.println(hs.size());
			hs.clear();
		}
	}

}
