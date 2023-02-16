package array;

public class NextGreaterElementI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {2,4}; 
		int nums2[] = {1,2,3,4};
		
		int res[]=new int[nums1.length];
		
		for(int i=0;i<nums1.length;i++) {
			int el=nums1[i];
			int index=findNumberIndex(el,nums2);
			if(index != -1) {
				res[i]=findGreaterNum(el,index,nums2);
			}else {
				res[i]=-1;
			}
		}
		for(int el:res) {
			System.out.println(el);
		}
	}
	private static int findGreaterNum(int el,int index, int[] nums2) {
		// TODO Auto-generated method stub
		for(int i=index+1;i<nums2.length;i++) {
			if(nums2[i] > el) {
				return nums2[i];
			}
		}
		return -1;
	}
	public static int findNumberIndex(int num,int nums[]) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == num) {
				return i;
			}
		}
		return -1;
	}
}
