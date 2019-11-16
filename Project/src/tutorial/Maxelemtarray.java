package tutorial;

import java.util.Scanner;

public class Maxelemtarray {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);

	        System.out.print("\nEnter size ");
	        int n=s.nextInt();
	        int[] a=new int[n];
		 int max = 0;
		 
		 System.out.print("Enter elements ");
	      for(int i=0; i<n; i++ ) {
	    	  a[i]=s.nextInt();
	      }
	     
	      for(int i=0; i<n; i++ ) {
	         if(a[i]>max) {
	            max = a[i];
	         }}
	      System.out.print(max);

	}

}
