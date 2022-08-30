package leetcode.easy;

import java.util.HashMap;
import java.util.Set;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

/*
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:

Input: nums = [2,2,1]
Output: 1
 */
public class SingleNumber {
	static HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,4,9,4,2};
		//singleNumberWithHashMap(nums);
		singleNumberWithXOR(nums);
		
	}
	private static void singleNumberWithXOR(int nums[]) {
		int result=0;
		for(int i=0;i<nums.length;i++) {
			result =result ^ nums[i];
		}
		System.out.println(result);
	}
	private static void singleNumberWithHashMap(int nums[]) {
		
		
		for(int i=0;i<nums.length;i++) {
			if(hm.containsKey(nums[i])) {
				hm.put(nums[i], hm.get(nums[i])+1);
			}else {
				hm.put(nums[i], 1);
			}
		}
		Set<Integer> numsSet=hm.keySet();
		for(int num:numsSet) {
			if(hm.get(num)==1) {
				System.out.println(num);
				return;
			}
		}
	}

}
