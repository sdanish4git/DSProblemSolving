package heap;

public class MaxHeap {
	Integer[] heap;
	int n;
	
	MaxHeap(int capacity){
		heap=new Integer[capacity+1]; //0 index ignoring
		n=0;	
	}
	
	public int size() {
		return n;
	}
	public void insert(int element) {
		if(this.size()==heap.length-1) {
			resize(2*heap.length);
		}
		n++;
		heap[n]=element;
		heapify(n);
	}
	public void heapify(int k) {
		while(k>1) {
			if(heap[k]>heap[k/2]) {
				int temp=heap[k/2];
				heap[k/2]=heap[k];
				heap[k]=temp;
				k=k/2;
			}else {
				return;
			}
		}
	}
	public void print() {
		for(int i=1;i<heap.length;i++) {
			System.out.print(heap[i]+" ");
		}
	}
	public void resize(int size) {
		Integer[] temp=new Integer[size];
		for(int i=0;i<heap.length;i++) {
			temp[i]=heap[i];
		}
		heap=temp;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeap maxHeap=new MaxHeap(7);
		maxHeap.insert(50);
		maxHeap.insert(40);
		maxHeap.insert(45);
		maxHeap.insert(30);
		maxHeap.insert(20);
		maxHeap.insert(35);
		maxHeap.insert(10);
		maxHeap.insert(60);
		maxHeap.print();
	}

}
