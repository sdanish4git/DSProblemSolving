package array2D;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row count ");
		int row=sc.nextInt();
		System.out.println("Enter Col count ");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			System.out.println("enter Element "+i+" "+j);
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter row count ");
		row=sc.nextInt();
		System.out.println("Enter Col count ");
		col=sc.nextInt();
		int a2[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			System.out.println("enter Element "+i+" "+j);
				a2[i][j]=sc.nextInt();
			}
		}
		
		//Matrix Mutliplication
		
		int res[][]=new int[a.length][a2[0].length];
		
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[0].length;j++) {
				
				for(int k=0;k<res[0].length;k++) {
					res[i][j] += a[i][k]*a2[k][j];
				}
			}
		}
		
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[0].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
