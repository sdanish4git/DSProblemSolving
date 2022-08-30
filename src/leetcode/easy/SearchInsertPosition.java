package leetcode.easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(serachInsertPosByBruteForce());
	}
	
	public static int serachInsertPosByBruteForce() {
		int a[]= {1,4,7,9};
		int target=8;
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==target) { 
				index=i;
				break;
			}else if(a[i]>target) {
				index=i;
				break;
			}
			
		}
		if(index==0) index=a.length;
		return index;
	}

}
