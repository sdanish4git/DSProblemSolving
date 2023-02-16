package array;

public class LemonadeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bills[]= {5,5,10,10,20};
		System.out.println(lemonadeChange(bills));
	}
	
	 public static boolean lemonadeChange(int[] bills) {
		 int ch5=0;
	     int ch10=0;
	        
	        for(int i=0;i<bills.length;i++){
	            int changeReturn=bills[i]-5;
	           
	            if(changeReturn==0) {
	                ch5++;
	                
	                continue;
	            }
             int tens=changeReturn/10;
	            if(ch10>0 && tens>0 && tens<= ch10) {
	            	changeReturn -=10;
	            	ch10--;
	            }
             int fives=changeReturn/5;
	            if(ch5>0 && fives<=ch5) {
	            	changeReturn-=5*fives;
	            	ch5 -=fives;
	            }
	            if(bills[i]==10) {
	            	ch10++;
	            }
	            if(changeReturn !=0) {
	            	return false;
	            }
	        }
	        return true;
	        
	    }

}
