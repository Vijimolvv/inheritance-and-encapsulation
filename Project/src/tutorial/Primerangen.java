package tutorial;

import java.util.Scanner;

public class Primerangen {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the  limit");
		int num1=s.nextInt();
		
		int i,j,flag=0;
		
		for(i=2;i<=num1+1;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
					
			
				}
				else {
					
					flag=1;		
					}
			}
			if(flag==1)
			{
				System.out.println(i);
			}
		}}}