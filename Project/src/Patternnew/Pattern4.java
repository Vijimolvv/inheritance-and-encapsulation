package Patternnew;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		 System.out.println("enter a num");
		 int n=s.nextInt();
		 int i,j;
		 for(i=0;i<n;i++)
		 {
			 System.out.println(" \t  "); 
			 for(j=n;j<n-1;j--)
			 {
				
				System.out.printf(" * ");
				
			 }
			 
		 }

	}

}
