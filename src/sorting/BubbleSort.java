package sorting;

public class BubbleSort {
	//https://www.youtube.com/watch?v=PkJIc5tBRUE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,8,2,1,3};
		//outer loop act as counter
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int el:a) {
			System.out.print(el+" ");
		}

	}

}
