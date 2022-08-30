package leetcode.easy;
//27. Remove Element
public class RemoveValFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,3,6,8};
		
		int val=3; //this value should be removed from Array
		int i=0;
		int j=a.length-1;
		while(i<j) {
			while(i<j && a[i]!=val) {
				i++;
			}
			if(a[j]==val) j--;
			if(i<j) {
			a[i++]=a[j--];
			}
		}
		for(int s:a) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println(i+1);
	}

}
