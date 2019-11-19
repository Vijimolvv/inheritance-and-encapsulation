package stringprograms;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter size");
		int n= s.nextInt();
		int i=0;
		int count[]=new int[n];
		System.out.println("enter the elements");
		for(i=0;i<n;i++)
		{
		
		count[i]=s.nextInt();
		
		}
		System.out.println(" the elements are");
		for(i=0;i<n;i++)
		{
		
			System.out.println(count[i]);
		
		}
		
		
		

	}

}
