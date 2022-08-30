package sorting;

public class SelectionSort {
	//https://www.youtube.com/watch?v=PkJIc5tBRUE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 7, 8, 2, 1, 3 };
		// we will pick smallest element and swap
		// to the begining
		int smallest = 0;
		for (int i = 0; i < a.length - 1; i++) {
			smallest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[smallest] > a[j]) {
					smallest = j;
				}
			}

			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;

		}
		for(int el:a) {
			System.out.print(el+" ");
		}
	}

}
