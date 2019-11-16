package tutorial;

import java.util.Scanner;

public class Evenodd {

	
		  public static void main(String [] args)
		  {
		     Scanner s=new Scanner(System.in);
				//System.out.println("Enter the size of array:");
				int n=s.nextInt();
			  int i=0;
				int[]arr=new int[n];
				int[] odd=new int[n];
				int[]even=new int[n];
				System.out.println("Array elements are :");
				for(i=0;i<n;i++)
				{
				arr[i]=s.nextInt();
				}
			  for(i=0;i<n;i++)
			  {
				if(arr[i]%2==0) 
				{
					odd[i]=arr[i];
					System.out.println(odd[i]); 
					
				}
			 else 
			 {
				 even[i]=arr[i];
				 System.out.println(even[i]); 
				 
			 }}
			  
				//System.out.println(even[i]);
				  
				  
		  }
		}
		
		
	