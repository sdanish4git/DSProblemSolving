package leetcode.easy;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,1,2,2,67,67};
		printArray(num);
		System.out.println();
		//removeduplicateBrutforce(num);
		removeDuplicateBestSolution(num);
		printArray(num);
	}

	private static void removeDuplicateBestSolution(int[] num) {
		int i=0;
		int j=0;
		while(i<num.length) {
			while(i<num.length-1 && num[i]==num[i+1]) {
				i++;
			}
			num[j]=num[i];
			i++;
			j++;
		}
	}

	private static void removeduplicateBrutforce(int[] num) {
		
	
		int count=0;
		for(int i=0;i<num.length-count;i++) {
			int j=i;
			if(num[i]==num[i+1]) {
				count++;
				while(j<num.length-count) {
					int temp=0;
					num[j]=num[j+1];
					num[j+1]=temp;
					j++;
				}
				
			}
		}
		
	}
	
	public static void printArray(int a[]) {
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
