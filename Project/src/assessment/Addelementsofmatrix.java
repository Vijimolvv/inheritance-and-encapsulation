package assessment;

import java.util.Scanner;

public class Addelementsofmatrix {

	public static void main(String[] args) {
		
		int m, n, c, d,sum=0,max,temp;
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter the number of rows and columns of matrix");
	      m = in.nextInt();
	      n  = in.nextInt();
	     
	      int first[][] = new int[m][n];
	     // int second[][] = new int[m][n];
	     // int sum[][] = new int[m][n];
	     
	      System.out.println("Enter the elements of first matrix");
	     
	      for (c = 0; c < m; c++) {
	    	  
	         for (d = 0; d < n; d++)
	         {
	            first[c][d] = in.nextInt();
	           
	}

}
	      for (c = 0; c < m; c++) {
	    	  
		         for (d = 0; d < n; d++)
		         {
		        	 sum=sum+first[c][d];
		         
		         }}
		         System.out.printf("sum= %d",sum);
		         }
	      
}
