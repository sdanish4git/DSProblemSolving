package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(majorityElementUsingSort(new int[] {6,6,6,7,7}));
	}
	 public static int majorityElement(int[] nums) {
		 	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		 	
		 	for(int i=0;i<nums.length;i++) {
		 		if(hm.containsKey(nums[i]) && hm.get(nums[i])+1>nums.length/2) {
		 			return nums[i];
		 		}else {
		 			hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
		 		}
		 	}
		 	
	        return -1;
	    }
	 public static int majorityElementUsingSort(int[] nums) {
		 
		 Arrays.sort(nums);
		 return nums[nums.length/2];
		 
	 }

}
