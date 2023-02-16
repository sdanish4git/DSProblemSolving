package heap;

import java.util.PriorityQueue;

public class RelativeRanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PriorityQueue<Integer> pq=new PriorityQueue<>((n1,n2) -> score[n2]-score[n1]);
	        for(int i=0;i<score.length;i++){
	            pq.add(i);
	        }
	        String res[]=new String[score.length];
	        if(!pq.isEmpty()) res[pq.poll()]="Gold Medal";
	        if(!pq.isEmpty()) res[pq.poll()]="Silver Medal";
	        if(!pq.isEmpty()) res[pq.poll()]="Bronze Medal";
	        int rank=4;
	        while(!pq.isEmpty()){
	            res[pq.poll()]=String.valueOf(rank++);
	        }
	        return res;
	        
	    }
	}

}
