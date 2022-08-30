package sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,99,24,35,59};
		divide(a,0,a.length-1);
		for(int e:a) {
			System.out.print(e+" ");
		}
	}
	
	public static void divide(int a[],int beg,int end) {
		if(beg>=end) {
			return;
		}
		int mid=beg +(end-beg)/2;
		divide(a,beg,mid);
		divide(a,mid+1,end);
		merge(a,beg,mid,end);
	}
	public static void merge(int a[],int si,int mid,int ei) {
		int temp[]=new int[ei-si+1];
		int indx1=si;
		int indx2=mid+1;
		int k=0;
		while(indx1<=mid && indx2<=ei) {
			if(a[indx1]<=a[indx2]) {
				temp[k++]=a[indx1++];
			}else {
				temp[k++]=a[indx2++];
			}
		}
		while(indx1<=mid) {
			temp[k++]=a[indx1++];
		}
		while(indx2<=ei) {
			temp[k++]=a[indx2++];
		}
		for(int i=si,j=0;i<temp.length;i++,j++) {
			a[i]=temp[j];
		}
		
	}

}
