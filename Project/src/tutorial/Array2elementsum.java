package tutorial;

import java.util.Scanner;

public class Array2elementsum {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			System.out.println("Enter the size of array:");
			int n=s.nextInt();
			int[] a=new int[n];
			int i,n1=0,n2=0,n3=0;
			
			System.out.println("Enter the first pos:");
			int pos1=s.nextInt();
			System.out.println("Enter the 2 nd pos:");
			int pos2=s.nextInt();
			System.out.println("Enter elements are:");
			for(i=0;i<n;i++)
			{
   a[i]=s.nextInt();
     }
			
			for(i=0;i<n;i++)
			{
			if(i==pos1)
			{
				 n1=a[i];
			}}
			for(i=0;i<n;i++)
			{
			if(i==pos2)
			{
				 n2=a[i];
			}}
			 n3=n1+n2;
			System.out.println("The sum is:");
			System.out.println(n3);
			
	}

}
