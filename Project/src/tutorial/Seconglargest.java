package tutorial;

import java.util.Scanner;

public class Seconglargest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size");
		int size =s.nextInt();
		int a[]=new int[size];
		
		int temp,i,j;
		System.out.println("enter the numbers");
		for(i=0;i<size;i++)
		{
		a[i]=s.nextInt();
		}
		
		for(i=0;i<size;i++)
		{
		for(j=i+1;j<size;j++)
		{
		if(a[i]>a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;

		}
		}
		}
		System.out.println(a[size-2]);
	
	}

}
