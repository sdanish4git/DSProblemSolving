package array2D;

import java.util.Scanner;

public class WaveTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m[][];
		int r=sc.nextInt();
		int c=sc.nextInt();
		m=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				m[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered Matrix ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<c;i++) {
			if(i % 2 == 0) {
			for(int j=0;j<r;j++) {
				//m[i][j]=sc.nextInt();
				System.out.print(m[j][i] +" ");
			}
			}else {
				for(int j=r-1;j>=0;j--) {
					System.out.print(m[j][i] +" ");
				}
			}
			System.out.println();
		}
	}

}
