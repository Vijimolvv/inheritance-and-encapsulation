package tutorial;

import java.util.Scanner;

public class Arrayinsertion {

	public static void main(String[] args) {
		
		
	
		   Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the position :");
	int pos = s.nextInt();
		System.out.println("Enter the element to be inserted :");
	int	x = s.nextInt();
		int i;
		 System.out.println("Array elements are :");
		for(i=0;i<n;i++)
		{
		a[i]=s.nextInt();
		}
		
		  System.out.println("Array elements after insertion :");
		   for(i=0;i<(pos-1);i++)
		   {
		      System.out.println(a[i]);
		   }
		 
		   System.out.println(x);
		  
		   for(i=pos-1;i<n;i++)
		   {
			   
		       System.out.println(a[i]);
		   }
		  }
		}




		
		
	
