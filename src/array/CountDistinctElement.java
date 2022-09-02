package array;

import java.util.HashSet;

public class CountDistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,10,5,4,5,10};
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		System.out.println(hs.size());
	}

}
