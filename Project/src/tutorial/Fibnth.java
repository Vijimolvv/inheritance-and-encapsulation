package tutorial;

import java.util.Scanner;

public class Fibnth {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		
		int a=0,b=1,c=0;
		System.out.println("enter a limit");
		
		int n=s.nextInt();
		//System.out.println(a);
	//	System.out.println(b);
		for(int i=0;i<n-2;i++)
		{
			 c=a+b;
			
		
		a=b;
		b=c;
	}
		System.out.println(c);

}}
