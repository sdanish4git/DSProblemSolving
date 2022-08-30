package array;

public class SubArrayofGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//solution1(); //O(n^2)
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int n = 10, s = 15;
		int left=0;
		int right=0;
		int sum=0;
		while(right<n) {
			
			if(sum==s) {
				System.out.println((left+1)+" "+(right));
				break;
			}
			if(sum<s) {
				sum=sum+a[right];
				right++;
			}else {
				
				sum=sum-a[left];
				left++;
				
			}
		}
		
	}

	private static void solution1() {
		String s1=new String("hello");
		String s2=new String(null);
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		 int n = 10, s = 15;
		int start=0;
		int end=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				sum=sum+a[j];
				if(sum==s) {
					start=i+1;
					end=j+1;
					i=n;
				}
			}
			sum=0;
		}
		System.out.println(start+"  "+end);
	}

}
