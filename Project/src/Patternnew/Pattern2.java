package Patternnew;

import java.util.Scanner;

public class Pattern2 {

	g  static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 System.out.println("enter a num");
		 int n=s.nextInt();
		 int i,j;
		 for(i=0;i<n;i++)
		 {
			 System.out.println(""); 
			 for(j=n;j>i;j--)
			 {
				
				 System.out.printf("*");
				
			 }
			 
		 }
		 

	}

}

	