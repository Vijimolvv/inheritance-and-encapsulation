package tutorial;

import java.util.Scanner;

public class Arrayin {

	public static void main(String[] args) {
		
				   Scanner s=new Scanner(System.in);
				System.out.println("Enter the size of array:");
				int n=s.nextInt();
				int[] a=new int[n];
				int[] b=new int[n];
				int[] c=new int[n];
				
				int i;
				 System.out.println("Array elements are :");
				for(i=0;i<n;i++)
				{
				a[i]=s.nextInt();
				}
				System.out.println("Enter the position :");
				int pos = s.nextInt();
					System.out.println("Enter the element to be splitted :");
				//int	x = s.nextInt();
				
				  System.out.println("Array elements splitting :");
				  System.out.println("first array :");
				   for(i=0;i<(pos-1);i++)
				   {
				      System.out.println(a[i]);
				   }
				 
				   
				  // for(i=0;i<(pos-1);i++)
				   //{
				   //   System.out.println(a[i]);
				   //}
				  // System.out.println(x);
				   System.out.println("Array elements splitting :");
					  System.out.println("second array :");
				  for(i=pos-1;i<n;i++)
				   {
					   
				       System.out.println(a[i]);
				   }
				 




				
				
			


	}

}
