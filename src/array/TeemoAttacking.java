package array;

public class TeemoAttacking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int timeSeries[] = {1,2}; 
		 int duration = 2;
		 int total=0;
		 for(int i=1;i<timeSeries.length;i++) {
			 if(timeSeries[i]>timeSeries[i-1]+duration-1) {
				 total +=duration;
			 }else {
				total=total+(timeSeries[i]-timeSeries[i-1]); 
			 }
		 }
		 
			total=total+duration; 
		 
		 System.out.println(total);
	}
	public int findPoisonedDuration(int[] timeSeries, int duration) {
	    int n = timeSeries.length;
	    if (n == 0) return 0;

	    int total = 0;
	    for(int i = 0; i < n - 1; ++i)
	      total += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
	    return total + duration;
	  }
}
