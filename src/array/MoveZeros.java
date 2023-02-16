package array;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,0,3,12};
		int i=0;
		int j=0;
		while(j<a.length) {
			if(a[j]!=0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			}else {
				j++;
			}
			
		}
		for(int n:a) {
			System.out.println(n);
		}
	}

}
