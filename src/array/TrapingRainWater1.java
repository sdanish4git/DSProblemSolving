package array;

public class TrapingRainWater1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		int left[]=new int[height.length];
		int right[]=new int[height.length];
		int maxLeft=Integer.MIN_VALUE;
		for(int i=0;i<height.length;i++) {
			if(maxLeft<height[i]) {
				maxLeft=height[i];
			}
			left[i]=maxLeft;
		}
		int maxRight=Integer.MIN_VALUE;
		for(int i=height.length-1;i>=0;i--) {
			if(maxRight<height[i]) {
				maxRight=height[i];
			}
			right[i]=maxRight;
		}
		int trappingUnit=0;
		for(int i=0;i<height.length;i++) {
			trappingUnit +=Math.min(left[i], right[i])-height[i];
		}
		System.out.println(trappingUnit);
	}

}
