package array;

public class UniquePairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 8
		 8
		 7+1
		 6+2
		 5+3
		 5+2+1
		 4+3+1
		 6
		 5+1
		 4+2
		 3+2+1
		 9
		 8+1
		 7+2
		 6+3
		 6+2+1
		 5+4
		 5+3+1
		 4+3+2
		 
		 
		 */
		int n=10;
		int count=1;
		int sum=0;
		String pair="";
		for(int i=n-1;i>n/2-1;i--) {
			sum +=i;
			pair=pair+i;
			for(int j=i-1;j>0;j--) {
				
				if(sum+j==n) {
					count++;
					System.out.println(pair+j);
					sum=i;
					pair=""+i;
				}else if(sum+j <n) {
					pair=pair+j;
					sum +=j;
				}
			}
			sum=0;
			pair="";
		}
		System.out.println(count);
	}

	
}
