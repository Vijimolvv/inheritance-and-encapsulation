package tutorial;

import java.util.Scanner;

public class Matrixadd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the row size of matrix");
		int m=s.nextInt();
		System.out.println("enter the column size of matrix");
		int n=s.nextInt();
		int i,j;
		int mat[][]=new int[m][n];
		int mat1[][]=new int[m][n];
		int mat2[][]=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			
			mat[i][j]=s.nextInt();
		}}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			mat1[i][j]=s.nextInt();
		}
		}
		for(i=0;i<m;i++)
		
			for(j=0;i<n;j++)
			
			
		mat2[i][j]=mat[i][j]+mat1[i][j];
		
		
		for(i=0;i<m;i++)
		{
			for(j=0;i<n;j++)
			
			
		System.out.print(mat2[i][j]+"\t");
		System.out.println();
			}
	}

}
