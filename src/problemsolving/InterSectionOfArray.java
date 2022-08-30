package problemsolving;

import java.util.ArrayList;
import java.util.HashMap;

public class InterSectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums1[]= {4,9,5};
		int nums1[]= {1,2,2,1};
		//int nums2[]= {9,4,9,8,4};
		int nums2[]= {2,2};
		int result[]=intersect(nums1,nums2);
		for(int j:result) {
			System.out.println(j+" ");
		}
	}
	
	 public static int[] intersect(int[] nums1, int[] nums2) {
	        
	        HashMap<Integer,Integer> hs=new HashMap();
	        ArrayList<Integer> al=new ArrayList<>();
	        
	        for(int i=0;i<nums1.length;i++){
	            if(hs.containsKey(nums1[i])){
	                hs.put(nums1[i],hs.get(nums1[i])+1);
	            }else{
	                hs.put(nums1[i],1);
	            }
	        }
	        //int size=(nums1.length>nums2.length) ?nums2.length:nums1.length;
	        
	        int j=0;
	        for(int i=0;i<nums2.length;i++){
	            if(hs.containsKey(nums2[i])&& hs.get(nums2[i])>0){
	                //inter[j++]=nums2[i];
	            	j++;
	                hs.put(nums2[i],hs.get(nums2[i])-1);
	                al.add(nums2[i]);
	               //hs.remove(nums2[i]);
	            }
	        }
	        int inter[]=new int[j];
	        int i=0;
	        for(int el:al) {
	        	inter[i++]=el;
	        }
	        
	        return inter;
	        
	        
	    }

}
