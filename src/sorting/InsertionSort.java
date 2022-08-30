package sorting;

public class InsertionSort {
    //https://www.youtube.com/watch?v=PkJIc5tBRUE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 7, 8, 2, 1, 3 };
		for(int i=0;i<a.length;i++) {
			int current=a[i];
			int j=i-1;
			while(j>=0 && current<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=current;
		}
		for(int el:a) {
			System.out.print(el+" ");
		}
	}

}
