package priorityqueue;

import java.util.PriorityQueue;

public class TopKFrequentElements347 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair p1=new Pair(2,4);
		Pair p2=new Pair(3,5);
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		pq.add(p1);
		pq.add(p2);
		System.out.println(pq.poll());
	}
	
	static class Pair implements Comparable<Integer>{
		int element;
		int count;
		public Pair(int element, int count) {
			super();
			this.element = element;
			this.count = count;
		}
		@Override
		public int compareTo(Integer o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}

}
