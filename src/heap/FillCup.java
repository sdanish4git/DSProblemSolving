package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FillCup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount[]= {1,4,2};
		System.out.println(new FillCup().fillCups(amount));
	
	}
	
	public int fillCups(int[] amount) {

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        int second=0;
        for(int n:amount){
            pq.add(n);
        }

        while(!pq.isEmpty()){
            if(pq.size()>1){
                second++;
                int cup1=pq.poll();
                int cup2=pq.poll();
                if(cup1>0  && cup1-1!=0) pq.add(--cup1);
                if(cup2>0 && cup2-1 != 0) pq.add(--cup2);

            }else if(pq.size() == 1){
                second +=pq.poll();
            }
        }
       return second; 
    }

}
