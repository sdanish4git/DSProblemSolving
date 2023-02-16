import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
	         List<Integer> row = new ArrayList<>();
	        for (int i = 0; i <= 1; i++) {
	            row.add(0, 1);
	            for (int j = 1; j < i; j++) {
	                row.set(j, row.get(j) + row.get(j + 1));
	            }
	        }
	        System.out.println(row);;
	        
	    
		
		String s1="Flow";
		String s2="Flow";
		//System.out.println(s2.indexOf(s1));
		
		int a1[]= {4,5,6,7};
		int a2[]= {1,2,9,10};
		
		int a3[]=new int[8];
		int i=0;
		int j=0;
		int k=0;
		while(i<a1.length && j<a2.length) {
			if(a2[j] < a1[i]) {
				a3[k++]=a2[j++];
			}else {
				a3[k++]=a1[i++];
			}
		}
		while(i<a1.length) {
			a3[k++]=a1[i++];
		}
		while(j < a2.length) {
			a3[k++]=a2[j++];
		}
		for(int e:a3) {
			System.out.println(e);
		}
		
		
	}

}
