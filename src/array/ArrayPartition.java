package array;

import java.util.Arrays;

public class ArrayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {6,2,6,5,1,2};
		int sum=0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i +=2) {
			sum +=nums[i];
		}
		System.out.println(sum);
	}

}
