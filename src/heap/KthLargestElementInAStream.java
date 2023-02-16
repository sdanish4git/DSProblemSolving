package heap;

import java.util.PriorityQueue;

public class KthLargestElementInAStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int inputs[]= {4,5,8,2};
		KthLargestElementInAStream obj=new KthLargestElementInAStream(k, inputs);
		System.out.println(obj.add(3));
		
	}
	 PriorityQueue<Integer> pq=new PriorityQueue<>();
	    int size;
	    public KthLargestElementInAStream(int k, int[] nums) {
	        for(int n:nums){
	            pq.add(n);
	            size=k;
	            if(pq.size()>size){
	                pq.poll();
	            }
	        }
	    }
	    
	    public int add(int val) {
	        pq.add(val);
	        if(pq.size()>size){
	            pq.poll();
	        }
	        return pq.peek();
	    }
}
