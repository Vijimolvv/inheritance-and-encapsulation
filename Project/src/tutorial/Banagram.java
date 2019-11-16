package tutorial;

import java.util.Scanner;

public class Banagram {

	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		 Scanner s=new Scanner (System.in);
	        int n=s.nextInt();
	        int i,len=0;
	        char reverse;
	        String arr[]=new String[n];
	        String odd[]=new String[n];
	        String even[]=new String[n];
	        for(i=0;i<n;i++)
	        {
	       arr[i]=s.next();
	        }
	        System.out.println("Strings are:");
	        for(i=0;i<n;i++)
	        {
	        	System.out.println(arr[i]);
	        	System.out.println("\n");
	        }
	        
	        for(i=0;i<n;i++)
	        {
	        	len=arr[i].length();
	        
	        if(len%2==0)
	        {
	        	System.out.println("Even Strings are:");
	        	System.out.println(arr[i]);
	        	even[i]=arr[i];
	}
	        else
	        { System.out.println("Odd Strings are:");
	        	System.out.println(arr[i]);
	        	odd[i]=arr[i];
	        }
	        }
	       
	        
	        
}}
