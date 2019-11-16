package tutorial;

import java.util.Scanner;
public class Arraysearch {

	public static void main(String[] args) {



Scanner s=new Scanner(System.in);
				System.out.println("Enter the size of array:");
				int n=s.nextInt();
				int[] a=new int[n];
			int	flag=0;
			//	System.out.println("Enter the position :");
			//int pos = s.nextInt();
				System.out.println("Enter the element to be searched :");
			int	x = s.nextInt();
				int i;
				 System.out.println("Array elements are :");
				for(i=0;i<n;i++)
				{
				a[i]=s.nextInt();
				}
				
				  System.out.println("Array elements searching :");
				  // for(i=0;i<(pos-1);i++)
				  // {
				  //    System.out.println(a[i]);
				  // }
				 
				   
				  
				   for(i=0;i<n;i++)
				   {
					   if (a[i]==x)
					   {
				       System.out.println(a[i]);
					   flag=1;
					   break;
					   }}
					   if (flag==1)
						   System.out.println("element  found"); 
						  
					   
					   else
						   System.out.println(" not found");
				   }
				  }
				




				
				
			

		
	